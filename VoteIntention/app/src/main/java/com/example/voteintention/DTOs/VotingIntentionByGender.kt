package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName


data class VotingIntentionByGender(
    @SerializedName("gender") val gender:String?,
    @SerializedName("acceptanceAndRejection") val acceptanceAndRejection: AcceptanceAndRejection?
)
