package com.example.android.alcintermediatechallengejdlagos.api;

import com.example.android.alcintermediatechallengejdlagos.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by C on 9/14/2017.
 */
public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
