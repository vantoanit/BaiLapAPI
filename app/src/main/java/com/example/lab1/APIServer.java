package com.example.lab1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServer {
    String DOMAIN = "http://192.168.0.114:3000/";

    @GET("/api/list")
    Call<List<CarModel>> getCars();
}
