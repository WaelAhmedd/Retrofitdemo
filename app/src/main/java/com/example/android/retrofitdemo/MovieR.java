package com.example.android.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class MovieR {

    @SerializedName("vote_average")
    private String voteAverage;
    private int id;
    private String title;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("poster_path")
    private String poster;
    @SerializedName("overview")
    private String overView;
    @SerializedName("backdrop_path")
    private String backdrop_path;



    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getVoteAverage() {

        return voteAverage;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getPoster() {
        return poster;
    }

    public String getOverView() {
        return overView;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }




}
