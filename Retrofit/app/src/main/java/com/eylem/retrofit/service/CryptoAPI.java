package com.eylem.retrofit.service;

import com.eylem.retrofit.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=7fe4c0fc6506ba1705af88ce3f464120")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
