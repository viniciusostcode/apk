package com.example.voteintention.usecase

import com.example.voteintention.data.Repository

class UseCaseByGender(private val repository: Repository) {
    operator fun invoke(gender:String) =
        repository.getAcceptanceAndRejectionByGender(gender)
}