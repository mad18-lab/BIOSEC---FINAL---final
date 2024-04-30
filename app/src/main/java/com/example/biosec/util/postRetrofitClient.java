package com.example.biosec.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class postRetrofitClient {

    private static Retrofit retrofit;
    private static final String POST_URL = "https://biosec-api-imtmoxa2zq-el.a.run.app/response/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(POST_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
