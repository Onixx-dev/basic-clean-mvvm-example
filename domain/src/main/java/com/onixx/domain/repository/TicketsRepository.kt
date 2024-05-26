package com.onixx.domain.repository

import com.onixx.domain.models.Tickets

interface TicketsRepository {
    suspend fun getTickets() : Tickets
}