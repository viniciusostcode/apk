package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName

data class VotingIntentionBySalary(
    @SerializedName("salaryRange") val rangeDouble: RangeDouble,
    @SerializedName("acceptanceAndRejection") val acceptanceAndRejection: AcceptanceAndRejection
)
