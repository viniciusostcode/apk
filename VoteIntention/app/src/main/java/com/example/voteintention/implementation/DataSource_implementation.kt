package com.example.voteintention.implementation

import com.example.voteintention.DTOs.VotingIntentionByGender
import com.example.voteintention.data.DataSource
import com.example.voteintention.retrofit.Retrofit


class DataSource_implementation(private val taskApi: Retrofit): DataSource {
    override fun getAcceptanceAndRejectionByGender(gender:String): VotingIntentionByGender {
        val request = taskApi.getRetrofitInstance()
            .getAcceptanceAndRejectionByGender(gender)
            .execute()
        val votingIntention:VotingIntentionByGender = if(request.isSuccessful){
            request.body()!!
        }else{
            VotingIntentionByGender(null, null)
        }
        return votingIntention
    }

}