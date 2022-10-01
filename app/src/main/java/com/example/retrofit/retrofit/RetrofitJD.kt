package com.example.retrofit.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory;


object RetrofitJD {
    var url = "http:/10.0.2.2:3141"
    var retrofitJD = Retrofit.Builder().baseUrl(url)
        .build()

    val apiRetrofit by lazy {
        retrofitJD.create(IServices::class.java)
    }

}