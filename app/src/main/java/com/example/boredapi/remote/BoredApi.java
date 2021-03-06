package com.example.boredapi.remote;

import com.example.boredapi.data.model.ActivitiesModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BoredApi {

    @GET("api/activity/")
    Call<ActivitiesModel> getActivities();

    @GET("/api/activity?type=")
    Call<ActivitiesModel> getType(@Query("type")String typeId);

    @GET("/api/activity?price=")
    Call<ActivitiesModel> getPrice(@Query("price") double price);


}
