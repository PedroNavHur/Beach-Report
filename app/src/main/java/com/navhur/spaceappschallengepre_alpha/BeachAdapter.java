package com.navhur.spaceappschallengepre_alpha;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
/**
 * Created by navar on 4/25/2017.
 */

public class BeachAdapter extends RecyclerView.Adapter<BeachAdapter.MyViewHolder> {

    private List<Beach> beachList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tittle, location, country;

        public MyViewHolder(View view) {
            super(view);
            tittle = (TextView) view.findViewById(R.id.title);
            location = (TextView) view.findViewById(R.id.location);
            country = (TextView) view.findViewById(R.id.country);
        }
    }

    public BeachAdapter(List<Beach> beachList){
        this.beachList = beachList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.beach_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public  void onBindViewHolder(MyViewHolder holder, int position){
        Beach beach = beachList.get(position);
        holder.tittle.setText(beach.getTittle());
        holder.location.setText(beach.getLocation());
        holder.country.setText(beach.getCountry());
    }

    @Override
    public int getItemCount(){
        return beachList.size();
    }
}
