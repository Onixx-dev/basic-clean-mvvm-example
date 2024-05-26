package com.onixx.domain.usecases

import com.onixx.domain.models.TicketOffers
import com.onixx.domain.repository.TicketOffersRepository

class FocusedOnCountryFieldUseCase(private val ticketOffersRepository: TicketOffersRepository) {

    suspend fun execute() : TicketOffers {
        val result = ticketOffersRepository.getTicketOffers()
        return result
    }

}