package com.example.android.retrofitdemo;



import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/top_rated")
    Call<List<MovieR>>getTopRatedMovies(@Query("api_key")String apiKey);

    @GET("/movie/top_rated")
    Call<ArrayList<MovieR>>getPopular(@Query("api_key")String apiKey);


}
