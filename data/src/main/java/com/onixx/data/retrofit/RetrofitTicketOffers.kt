package com.onixx.data.retrofit

import com.onixx.domain.models.TicketOffers
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitTicketOffers {

    @GET("ticketOffers")
    fun getTicketOffers(): Deferred<Response<TicketOffers>>

}