package nyc.c4q.mustafizurmatin.unit5exam;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import nyc.c4q.mustafizurmatin.unit5exam.doa.UserDao;
import nyc.c4q.mustafizurmatin.unit5exam.models.Developers;

/**
 * Created by c4q on 2/12/18.
 */

@Database(entities = {Developers.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao developersDoa();
}