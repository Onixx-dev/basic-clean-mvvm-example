package com.onixx.data.retrofit
import com.onixx.domain.models.Offers
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitOffers {

    @GET("offers")
    fun getOffers(): Deferred<Response<Offers>>


}