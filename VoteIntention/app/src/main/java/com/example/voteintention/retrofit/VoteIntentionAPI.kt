package com.example.voteintention.retrofit

import com.example.voteintention.DTOs.VotingIntentionByGender
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface VoteIntentionAPI {
    @GET("acceptance-rejection/by-gender/{gender}")
    fun getAcceptanceAndRejectionByGender(@Path("gender") gender:String):Call<VotingIntentionByGender>
}