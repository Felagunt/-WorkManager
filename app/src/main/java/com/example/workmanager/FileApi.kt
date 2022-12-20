package com.example.workmanager

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("/_V-vy8pJtuOY/TF7oOgR7A6I/AAAAAAAAMYQ/NvvO8bWtK7M/s1600/Screen+shot+2010-08-08+at+10.14.19+AM.png")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("http://2.bp.blogspot.com")
                .build()
                .create(FileApi::class.java)
        }
    }

}