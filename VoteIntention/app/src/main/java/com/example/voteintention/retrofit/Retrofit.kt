package com.example.voteintention.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    companion object{
        const val BASE_URL = "https://api-vote-main.herokuapp.com/"
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getRetrofitInstance(): VoteIntentionAPI = retrofit.create(VoteIntentionAPI::class.java)

}
