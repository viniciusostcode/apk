package com.example.voteintention.DTOs

import com.google.gson.annotations.SerializedName

data class RangeInt(
    @SerializedName("from") val ageFrom:Int,
    @SerializedName("to") val ageTo:Int
)