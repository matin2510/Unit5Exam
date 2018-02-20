package nyc.c4q.mustafizurmatin.unit5exam.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import nyc.c4q.mustafizurmatin.unit5exam.DeatilsActivity;
import nyc.c4q.mustafizurmatin.unit5exam.R;
import nyc.c4q.mustafizurmatin.unit5exam.models.Results;

/**
 * Created by c4q on 2/8/18.
 */

public class DevelopersViewHolder extends RecyclerView.ViewHolder {

    private ImageView userPicture;
    private TextView userName;


    public DevelopersViewHolder(View itemView) {
        super(itemView);

        userPicture = itemView.findViewById(R.id.user_image);
        userName = itemView.findViewById(R.id.user_name);
    }

    public void onBind(final Results results) {
        String name = "Username: " + results.getName().getFirst();
        userName.setText(name);
        Picasso.with(itemView.getContext()).load(results.getPicture().getMedium()).into(userPicture);
        userPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(itemView.getContext(), DeatilsActivity.class);
                intent.putExtra("Developer", results);
                itemView.getContext().startActivity(intent);

                Toast.makeText(itemView.getContext(), results.getName().getFirst(), Toast.LENGTH_SHORT).show();


            }
        });
    }
}