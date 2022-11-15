package com.example.android.network

import com.example.android.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface newsAPIservice{
    @GET("top-headlines?country=us&apikey=1c0bed622df14993bab444ba3742f369")
    suspend fun getTopHeadline():NewsData
}

object Api{
    val newsApiservice : newsAPIservice by lazy {
        retrofit.create(newsAPIservice::class.java)
    }
}