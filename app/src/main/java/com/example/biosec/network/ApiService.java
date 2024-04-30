package com.example.biosec.network;
import com.example.biosec.model.CheckResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("/check1")
    Call<CheckResponse> checkCall();
}
