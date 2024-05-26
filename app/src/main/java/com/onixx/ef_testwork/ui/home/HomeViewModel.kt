package com.onixx.ef_testwork.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onixx.data.repository.OffersRepositoryImpl
import com.onixx.data.repository.TicketOffersRepositoryImpl
import com.onixx.data.repository.TicketsRepositoryImpl
import com.onixx.domain.models.Offers
import com.onixx.domain.models.TicketOffers
import com.onixx.domain.models.Tickets
import com.onixx.domain.usecases.CountrySelectedUseCase
import com.onixx.domain.usecases.FocusedOnCountryFieldUseCase
import com.onixx.domain.usecases.GetMainPageUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewModel(
    private val getMainPageUseCase : GetMainPageUseCase,
    private val focusedOnCountryFieldUseCase : FocusedOnCountryFieldUseCase,
    private val countrySelectedUseCase : CountrySelectedUseCase
) : ViewModel() {

    private val offersRepository by lazy(LazyThreadSafetyMode.NONE){
        OffersRepositoryImpl()
    }
    private val ticketOffersRepository by lazy(LazyThreadSafetyMode.NONE){
        TicketOffersRepositoryImpl()
    }
    private val ticketsRepository by lazy(LazyThreadSafetyMode.NONE){
        TicketsRepositoryImpl()
    }


    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    private val offersMLD = MutableLiveData<Offers>().apply {value = Offers() }
    val offers: LiveData<Offers> = offersMLD

    private val ticketOffersMLD = MutableLiveData<TicketOffers>().apply {value = TicketOffers() }
    val ticketOffers: LiveData<TicketOffers> = ticketOffersMLD

    private val ticketsMLD = MutableLiveData<Tickets>().apply {value = Tickets()}
    val tickets: LiveData<Tickets> = ticketsMLD



    fun getMainMenu() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                offersMLD.postValue(getMainPageUseCase.execute())
            }
        }
    }

    fun focusedOnCountryField() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                ticketOffersMLD.postValue(focusedOnCountryFieldUseCase.execute())
            }
        }
    }

    fun countrySelected() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                ticketsMLD.postValue(countrySelectedUseCase.execute())
            }
        }
    }

}