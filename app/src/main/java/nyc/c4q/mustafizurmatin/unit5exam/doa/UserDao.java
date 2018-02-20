package nyc.c4q.mustafizurmatin.unit5exam.doa;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import nyc.c4q.mustafizurmatin.unit5exam.models.Developers;

/**
 * Created by c4q on 2/12/18.
 */
@Dao

public interface UserDao {
    @Query("SELECT * FROM developers")
    List<Developers> getAll();

    @Query("SELECT * FROM developers WHERE first_name LIKE :first LIMIT 1")
    Developers findByFirstName(String first);

   /* @Query("SELECT * FROM developers WHERE last_name LIKE :last LIMIT 1")
    Developers findByLastName(String last);
*/
    @Insert
    void insertAll(Developers... developers);

    @Delete
    void delete(Developers developers);


}
