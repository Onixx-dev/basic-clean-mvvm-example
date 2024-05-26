package com.onixx.domain.repository

import com.onixx.domain.models.Offers

interface OffersRepository {

    suspend fun getOffers() : Offers

}