package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class Offers (

  @SerializedName("offers" ) var offers : ArrayList<Offer> = arrayListOf()

)