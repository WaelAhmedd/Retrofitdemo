package com.example.android.retrofitdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.MyHolder>  {
    private ArrayList<MovieR> movies;
    private Context context;

    public AdapterMovie(ArrayList<MovieR> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view=LayoutInflater.from(context).inflate(R.layout.main_row_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
    MovieR movieR=movies.get(position);
    holder.name.setText(movieR.getTitle());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder {

    TextView name;
    public MyHolder(@NonNull View itemView) {
        super(itemView);
    name=itemView.findViewById(R.id.nametv);
    }
}
}
