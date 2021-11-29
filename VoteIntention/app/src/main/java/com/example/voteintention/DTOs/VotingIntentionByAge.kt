package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName

data class VotingIntentionByAge (
    @SerializedName("ageGroup") val rangeAge: RangeInt,
    @SerializedName("acceptanceAndRejection") val acceptanceAndRejection: AcceptanceAndRejection
)