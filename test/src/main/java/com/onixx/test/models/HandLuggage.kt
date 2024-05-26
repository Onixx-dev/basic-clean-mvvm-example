package com.onixx.test.models
import com.google.gson.annotations.SerializedName


data class HandLuggage (

  @SerializedName("has_hand_luggage" ) var hasHandLuggage : Boolean? = null,
  @SerializedName("size"             ) var size           : String?  = null

)