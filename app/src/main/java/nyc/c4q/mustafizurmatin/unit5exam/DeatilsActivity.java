package nyc.c4q.mustafizurmatin.unit5exam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.mustafizurmatin.unit5exam.models.Results;

public class DeatilsActivity extends AppCompatActivity {
    ImageView DetailImage;
    TextView Detailname;
    TextView Detailemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DetailImage = findViewById(R.id.developer_detail);
        Detailname = findViewById(R.id.developer_description);
        Detailemail = findViewById(R.id.developer_email);


        if (getIntent().getSerializableExtra("Developer") != null){

           Results results = (Results) getIntent().getSerializableExtra("Developer");
            Picasso.with(this)
                    .load(results.getPicture().getLarge())
                    .into(DetailImage);

            Detailemail.setText(results.getEmail());
            Detailname.setText(results.getName().getFirst());




        }


    }

}


