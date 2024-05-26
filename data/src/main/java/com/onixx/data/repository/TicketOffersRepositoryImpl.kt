package com.onixx.data.repository

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.onixx.data.retrofit.RetrofitTicketOffers
import com.onixx.domain.models.TicketOffers
import com.onixx.domain.repository.TicketOffersRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TicketOffersRepositoryImpl : TicketOffersRepository{

    override suspend fun getTicketOffers(): TicketOffers {

        val retrofitTicketOffers = Retrofit
            .Builder()
            .baseUrl("https://run.mocky.io/v3/7e55bf02-89ff-4847-9eb7-7d83ef884017/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(RetrofitTicketOffers::class.java)

        val result = retrofitTicketOffers
            .getTicketOffers()
            .await()

        return result.body() ?: TicketOffers()
    }
}