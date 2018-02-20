package nyc.c4q.mustafizurmatin.unit5exam.api;

import nyc.c4q.mustafizurmatin.unit5exam.models.DeveloperResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c4q on 2/8/18.
 */

public interface DevelopersService {
    @GET("api/")
    Call<DeveloperResponse> getUserData(

            @Query("nat") String nat,
            @Query("inc") String inc,
            @Query("results") int results



    );
}
