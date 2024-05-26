package com.onixx.domain.usecases

import com.onixx.domain.models.Tickets
import com.onixx.domain.repository.TicketsRepository

class CountrySelectedUseCase(private val ticketsRepository: TicketsRepository) {

    suspend fun execute() : Tickets {
        val result = ticketsRepository.getTickets()
        return result
    }

}