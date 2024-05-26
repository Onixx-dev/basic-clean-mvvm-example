package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class Departure (

  @SerializedName("town"    ) var town    : String? = null,
  @SerializedName("date"    ) var date    : String? = null,
  @SerializedName("airport" ) var airport : String? = null

)