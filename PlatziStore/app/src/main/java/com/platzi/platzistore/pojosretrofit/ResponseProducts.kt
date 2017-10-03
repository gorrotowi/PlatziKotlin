package com.platzi.platzistore.pojosretrofit

import com.google.gson.annotations.SerializedName

/**
 * @author Gorro.
 */
data class ResponseProducts(

        @field:SerializedName("payload")
        val payload: List<PayloadItem?>? = null,

        @field:SerializedName("statusCode")
        val statusCode: Int? = null
)