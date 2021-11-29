package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName

data class AcceptanceAndRejection(
    @SerializedName("positiveVotingIntention") val positiveVotingIntention:Int,
    @SerializedName("negativeVotingIntention") val negativeVotingIntention: Int,
    @SerializedName("rejection") val rejection:Double,
    @SerializedName("acceptance") val acceptance:Double
)
