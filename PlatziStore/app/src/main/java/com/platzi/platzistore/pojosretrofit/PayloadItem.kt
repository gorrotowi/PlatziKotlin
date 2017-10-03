package com.platzi.platzistore.pojosretrofit

import com.google.gson.annotations.SerializedName

/**
 * @author Gorro.
 */
data class PayloadItem(

        @field:SerializedName("imgUrl")
        val imgUrl: String? = null,

        @field:SerializedName("descLong")
        val descLong: String? = null,

        @field:SerializedName("price")
        val price: Double? = null,

        @field:SerializedName("name")
        val name: String? = null,

        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("desc")
        val desc: String? = null
)