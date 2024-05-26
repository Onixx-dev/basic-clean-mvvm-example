package com.onixx.domain.repository

import com.onixx.domain.models.TicketOffers

interface TicketOffersRepository {

    suspend fun getTicketOffers() : TicketOffers

}