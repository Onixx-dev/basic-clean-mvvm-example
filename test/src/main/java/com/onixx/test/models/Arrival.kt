package com.onixx.test.models

import com.google.gson.annotations.SerializedName


data class Arrival (

  @SerializedName("town"    ) var town    : String? = null,
  @SerializedName("date"    ) var date    : String? = null,
  @SerializedName("airport" ) var airport : String? = null

)