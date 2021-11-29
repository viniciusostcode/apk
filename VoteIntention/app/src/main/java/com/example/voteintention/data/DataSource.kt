package com.example.voteintention.data

import com.example.voteintention.DTOs.VotingIntentionByGender

interface DataSource {
    fun getAcceptanceAndRejectionByGender(gender:String): VotingIntentionByGender
}