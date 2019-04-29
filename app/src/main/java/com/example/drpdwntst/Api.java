package com.example.drpdwntst;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {
    String BASE_URL = "https://api.myjson.com/bins/";

    @GET("z40as")
    Call<List<Kommune>> getKommune();
}
