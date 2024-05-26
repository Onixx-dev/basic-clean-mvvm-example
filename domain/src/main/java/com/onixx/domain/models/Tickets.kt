package com.onixx.domain.models
import com.google.gson.annotations.SerializedName


data class Tickets (

  @SerializedName("tickets" ) var tickets : ArrayList<Ticket> = arrayListOf()

)