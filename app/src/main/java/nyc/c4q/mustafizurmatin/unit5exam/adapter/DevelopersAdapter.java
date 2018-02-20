package nyc.c4q.mustafizurmatin.unit5exam.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.mustafizurmatin.unit5exam.R;
import nyc.c4q.mustafizurmatin.unit5exam.models.Results;
import nyc.c4q.mustafizurmatin.unit5exam.view.DevelopersViewHolder;

/**
 * Created by c4q on 2/8/18.
 */

public class DevelopersAdapter extends RecyclerView.Adapter<DevelopersViewHolder>{

    private List<Results> resultsList;

    public DevelopersAdapter(List<Results> resultsList) {
        this.resultsList = resultsList;
    }

    @Override
    public DevelopersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dev_item_view, parent, false);
        return new DevelopersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DevelopersViewHolder holder, int position) {
        holder.onBind(resultsList.get(position));


    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }
}
