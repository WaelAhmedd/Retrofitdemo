package com.example.android.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRetrofit {

    private static final String BASE_URL="https://api.themoviedb.org/3";
    private static Retrofit retrofit;

    public static Retrofit getApiRetrofit()
    { if (retrofit == null) {
        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
        return retrofit;
    }
}
