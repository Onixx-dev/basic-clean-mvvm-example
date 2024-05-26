package com.onixx.ef_testwork.di

import com.onixx.ef_testwork.ui.bottomSheet.BottomSheetViewModel
import com.onixx.ef_testwork.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<HomeViewModel> { HomeViewModel(get(), get(), get()) }

    viewModel<BottomSheetViewModel> { BottomSheetViewModel() }

}