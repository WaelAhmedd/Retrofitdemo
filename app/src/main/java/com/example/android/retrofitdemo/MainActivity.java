package com.example.android.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;

import java.util.ArrayList;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<MovieR>movieRS;
    RecyclerView list;
    AdapterMovie adapterMovie;
    final static String API_KEY="45a6d4800ed1cb6aa715e07c245e6119";
    ApiInterface apiInterface;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(RecyclerView)findViewById(R.id.rv_main_list);
        layoutManager=new LinearLayoutManager(  this);
        list.setLayoutManager(layoutManager);


        apiInterface=ApiRetrofit.getApiRetrofit().create(ApiInterface.class);
        retrofit2.Call<ArrayList<MovieR>> call=apiInterface.getPopular(API_KEY);
        call.enqueue(new Callback<ArrayList<MovieR>>() {
            @Override
            public void onResponse(retrofit2.Call<ArrayList<MovieR>> call, Response<ArrayList<MovieR>> response) {

            movieRS=response.body();
            adapterMovie=new AdapterMovie(movieRS,MainActivity.this);
            list.setAdapter(adapterMovie);
            }

            @Override
            public void onFailure(retrofit2.Call<ArrayList<MovieR>> call, Throwable t) {

            }
        });
    }
}
