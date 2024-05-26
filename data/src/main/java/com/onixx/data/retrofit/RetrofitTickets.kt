package com.onixx.data.retrofit

import com.onixx.domain.models.Tickets
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitTickets {


    @GET("tickets")
    fun getTickets(): Deferred<Response<Tickets>>

}