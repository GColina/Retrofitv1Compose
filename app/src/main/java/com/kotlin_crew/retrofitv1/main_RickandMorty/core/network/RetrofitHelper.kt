package com.kotlin_crew.retrofitv1.main_RickandMorty.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.disneyapi.dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}