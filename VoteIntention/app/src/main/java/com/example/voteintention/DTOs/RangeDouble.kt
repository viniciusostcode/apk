package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName

data class RangeDouble(
    @SerializedName("from") val from:Double,
    @SerializedName("to") val to:Double
)
