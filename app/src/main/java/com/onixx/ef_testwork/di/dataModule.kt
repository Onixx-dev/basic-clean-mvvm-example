package com.onixx.ef_testwork.di

import com.onixx.data.repository.OffersRepositoryImpl
import com.onixx.data.repository.TicketOffersRepositoryImpl
import com.onixx.data.repository.TicketsRepositoryImpl
import com.onixx.domain.repository.OffersRepository
import com.onixx.domain.repository.TicketOffersRepository
import com.onixx.domain.repository.TicketsRepository
import org.koin.dsl.module

val dataModule = module {

    single<OffersRepository> { OffersRepositoryImpl() }

    single<TicketOffersRepository> { TicketOffersRepositoryImpl() }

    single<TicketsRepository> { TicketsRepositoryImpl() }

}