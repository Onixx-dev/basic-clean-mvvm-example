package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class TicketOffer (

  @SerializedName("id"         ) var id        : Int?              = null,
  @SerializedName("title"      ) var title     : String?           = null,
  @SerializedName("time_range" ) var timeRange : ArrayList<String> = arrayListOf(),
  @SerializedName("price"      ) var price     : Price?            = Price()

)