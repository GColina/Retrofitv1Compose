package com.kotlin_crew.retrofitv1.main_RickandMorty.data.network

import com.kotlin_crew.retrofitv1.main.CharacterResponse
import retrofit2.http.GET

interface LoginClient {
    @GET("Characters")
    suspend fun getCharacters2():CharacterResponse
}