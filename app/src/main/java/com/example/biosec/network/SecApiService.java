package com.example.biosec.network;

import com.example.biosec.model.CreateResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SecApiService {
    @POST("/response")
    Call<CreateResponse> postCreateResponse(@Body CreateResponse createResponse);
}
