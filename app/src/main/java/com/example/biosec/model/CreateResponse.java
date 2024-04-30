package com.example.biosec.model;

import com.google.gson.annotations.SerializedName;

public class CreateResponse {
    @SerializedName("result")
    private String result;

    public CreateResponse(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
