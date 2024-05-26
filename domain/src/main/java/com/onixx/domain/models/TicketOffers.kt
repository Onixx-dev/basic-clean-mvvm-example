package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class TicketOffers (

  @SerializedName("tickets_offers" ) var ticketsOffers : ArrayList<TicketOffer> = arrayListOf()

)