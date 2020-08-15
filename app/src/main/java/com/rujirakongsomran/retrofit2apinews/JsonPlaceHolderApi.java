package com.rujirakongsomran.retrofit2apinews;

import com.rujirakongsomran.retrofit2apinews.Model.News;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("v2/everything?q=bitcoin&from=2020-07-15&sortBy=publishedAt&apiKey=c1fe8c279daa4e479cafb9f4df60933f")
    Call<News> getListNews();
}
