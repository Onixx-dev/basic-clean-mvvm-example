package com.onixx.data.repository

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.onixx.data.retrofit.RetrofitOffers
import com.onixx.domain.models.Offers
import com.onixx.domain.repository.OffersRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class OffersRepositoryImpl : OffersRepository {


    override suspend fun getOffers(): Offers {

        val retrofitOffers = Retrofit
            .Builder()
            .baseUrl("https://run.mocky.io/v3/214a1713-bac0-4853-907c-a1dfc3cd05fd/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(RetrofitOffers::class.java)

        val result = retrofitOffers
            .getOffers()
            .await()



        return result.body() ?: Offers()
    }

}