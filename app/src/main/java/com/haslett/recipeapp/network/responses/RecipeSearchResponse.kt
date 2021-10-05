package com.haslett.recipeapp.network.responses

import com.google.gson.annotations.SerializedName
import com.haslett.recipeapp.network.model.RecipeDto

data class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDto>

    ) {

}