package com.example.retrofit.retrofit

import com.example.retrofit.model.User
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface IServices {
    @GET("api/Usuarios")
    fun getUsers(): Call<ResponseBody>
}