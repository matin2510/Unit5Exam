package nyc.c4q.mustafizurmatin.unit5exam.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by c4q on 2/12/18.
 */
@Entity
public class Developers {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "first_name")
    private String firstName;
/*
    @ColumnInfo(name = "last_name")
    private String lastName;*/

    public Developers(String firstName) {

        this.firstName = firstName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
