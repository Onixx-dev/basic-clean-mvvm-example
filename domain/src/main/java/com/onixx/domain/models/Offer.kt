package com.onixx.domain.models


import com.google.gson.annotations.SerializedName


data class Offer (

  @SerializedName("id"    ) var id    : Int?    = null,
  @SerializedName("title" ) var title : String? = null,
  @SerializedName("town"  ) var town  : String? = null,
  @SerializedName("price" ) var price : Price?  = Price()

)