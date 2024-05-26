package com.onixx.domain.usecases

import com.onixx.domain.models.Offers
import com.onixx.domain.repository.OffersRepository

class GetMainPageUseCase(private val offersRepository: OffersRepository) {

    suspend fun execute() : Offers {
        val result = offersRepository.getOffers()
        return result
    }

}