package io.github.nazmi69.naksenang.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import io.github.nazmi69.naksenang.R;

/**
 * Created by User on 6/4/2016.
 */
public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.Viewholder> {

    String[] datasets;
    int[] imagesets;

    public ListItemAdapter(String[] myDatasets, int[] imagesets) {
        this.datasets = myDatasets;
        this.imagesets = imagesets;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rows_item, null);
        Viewholder rcv = new Viewholder(layoutView);
        return rcv;

    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        holder.imageView.setImageResource(imagesets[position]);
        holder.title.setText(datasets[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    class Viewholder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imageView;

        public Viewholder(View v) {
            super(v);

            title = (TextView) v.findViewById(R.id.title);
            imageView = (ImageView) v.findViewById(R.id.image);
        }
    }

}


