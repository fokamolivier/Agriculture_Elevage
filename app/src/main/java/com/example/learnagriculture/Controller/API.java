package com.example.learnagriculture.Controller;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("file.json")
    Call<Liste> getListSujets();
}
