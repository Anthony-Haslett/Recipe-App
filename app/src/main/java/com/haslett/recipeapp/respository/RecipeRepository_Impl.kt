package com.haslett.recipeapp.respository

import com.haslett.recipeapp.domain.model.Recipe
import com.haslett.recipeapp.network.RecipeService
import com.haslett.recipeapp.network.model.RecipeDtoMapper
import javax.inject.Singleton


class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String):
            List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}