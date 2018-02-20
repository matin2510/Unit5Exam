package nyc.c4q.mustafizurmatin.unit5exam;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.unit5exam.adapter.DevelopersAdapter;
import nyc.c4q.mustafizurmatin.unit5exam.api.DevelopersService;
import nyc.c4q.mustafizurmatin.unit5exam.models.DeveloperResponse;
import nyc.c4q.mustafizurmatin.unit5exam.models.Developers;
import nyc.c4q.mustafizurmatin.unit5exam.models.Results;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://randomuser.me/";

    private static final String TAG = "banana";

    public static String INC = "name,location,cell,email,dob,picture";
    public static String NAT= "us";
    public static int RESULTS = 20;



    private RecyclerView developersRV;
    private DevelopersAdapter developersAdapter;

    private List<Results> resultsList = new ArrayList<>();
    private  AppDatabase db;
    private Developers developersentity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        developersRV = findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        developersRV.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DevelopersService developersService = retrofit.create(DevelopersService.class);
        Call<DeveloperResponse> call = developersService.getUserData(NAT,INC,RESULTS);
        call.enqueue(new Callback<DeveloperResponse>() {
            @Override
            public void onResponse(Call<DeveloperResponse> call, Response<DeveloperResponse> response) {
                if (response.isSuccessful()){

                    Log.d(TAG, "onResponse: ");
                    DeveloperResponse developerResponse = response.body();

                    resultsList = developerResponse.getResults();
                    Log.d(TAG, "onResponse: " + resultsList.get(0).getName());

                    developersAdapter = new DevelopersAdapter(resultsList);
                    developersRV.setAdapter(developersAdapter);
                    db = Room.databaseBuilder(getApplicationContext(),
                            AppDatabase.class, "Developersdatabase-name").build();
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (Results r: resultsList) {
                                Developers developersntity = new Developers(r.getName().getFirst());
                                db.developersDoa().insertAll(developersntity);
                            }
                            db.close();

                        }
                    });
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    logDatabase();


                } else {
                    Log.d(TAG, "on Response Error: " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<DeveloperResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
                t.printStackTrace();

            }
        });
    }

    private void logDatabase() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "Developersdatabase-name").build();

                List<Developers> developersList = db.developersDoa().getAll();
                for (Developers d:developersList) {
                    Log.d(TAG, "logging Data: " + d.getFirstName());


                }
                db.close();

            }

        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
