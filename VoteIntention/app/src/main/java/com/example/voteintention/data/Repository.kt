package com.example.voteintention.data

import com.example.voteintention.DTOs.VotingIntentionByGender


class Repository(private val dataSource: DataSource) {
    fun getAcceptanceAndRejectionByGender(gender:String):VotingIntentionByGender =
        dataSource.getAcceptanceAndRejectionByGender(gender)
}