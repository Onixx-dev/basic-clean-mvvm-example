package com.onixx.domain.models

import com.google.gson.annotations.SerializedName


data class Ticket (

    @SerializedName("id"                ) var id              : Int?         = null,
    @SerializedName("badge"             ) var badge           : String?      = null,
    @SerializedName("price"             ) var price           : Price?       = Price(),
    @SerializedName("provider_name"     ) var providerName    : String?      = null,
    @SerializedName("company"           ) var company         : String?      = null,
    @SerializedName("departure"         ) var departure       : Departure?   = Departure(),
    @SerializedName("arrival"           ) var arrival         : Arrival?     = Arrival(),
    @SerializedName("has_transfer"      ) var hasTransfer     : Boolean?     = null,
    @SerializedName("has_visa_transfer" ) var hasVisaTransfer : Boolean?     = null,
    @SerializedName("luggage"           ) var luggage         : Luggage?     = Luggage(),
    @SerializedName("hand_luggage"      ) var handLuggage     : HandLuggage? = HandLuggage(),
    @SerializedName("is_returnable"     ) var isReturnable    : Boolean?     = null,
    @SerializedName("is_exchangable"    ) var isExchangable   : Boolean?     = null

)