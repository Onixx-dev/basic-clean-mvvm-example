package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class Luggage (

  @SerializedName("has_luggage" ) var hasLuggage : Boolean? = null,
  @SerializedName("price"       ) var price      : Price?   = Price()

)