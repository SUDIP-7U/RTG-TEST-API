package com.example.apitest

import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ResponseApi(
    @SerializedName("meals")
    val meals: List<Meal?>?
) {
    @Keep
    data class Meal(
        @SerializedName("idMeal")
        val idMeal: String?,
        @SerializedName("strMeal")
        val strMeal: String?,
        @SerializedName("strMealThumb")
        val strMealThumb: String?
    )
}
