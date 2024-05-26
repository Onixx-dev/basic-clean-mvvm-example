package com.onixx.ef_testwork.di

import com.onixx.domain.usecases.CountrySelectedUseCase
import com.onixx.domain.usecases.FocusedOnCountryFieldUseCase
import com.onixx.domain.usecases.GetMainPageUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<CountrySelectedUseCase> { CountrySelectedUseCase(get()) }

    factory<GetMainPageUseCase> { GetMainPageUseCase(get()) }

    factory<FocusedOnCountryFieldUseCase> { FocusedOnCountryFieldUseCase(get()) }

}