package com.example.lab10.data

import com.google.gson.annotations.SerializedName

data class SerieModel(
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var name: String,
    @SerializedName("description")
    var release_date: String,
    @SerializedName("price")
    var rating: Double,
    @SerializedName("category")
    var category: String
)
