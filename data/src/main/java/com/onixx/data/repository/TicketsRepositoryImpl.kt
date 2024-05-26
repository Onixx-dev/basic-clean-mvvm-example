package com.onixx.data.repository

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.onixx.data.retrofit.RetrofitTickets
import com.onixx.domain.models.Tickets
import com.onixx.domain.repository.TicketsRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TicketsRepositoryImpl : TicketsRepository {

    override suspend fun getTickets(): Tickets {
        val retrofitTickets = Retrofit
            .Builder()
            .baseUrl("https://run.mocky.io/v3/670c3d56-7f03-4237-9e34-d437a9e56ebf/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(RetrofitTickets::class.java)

        val result = retrofitTickets
            .getTickets()
            .await()

        return result.body() ?: Tickets()
    }
}