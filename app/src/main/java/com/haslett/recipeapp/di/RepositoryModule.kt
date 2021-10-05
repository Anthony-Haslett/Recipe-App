package com.haslett.recipeapp.di

import com.haslett.recipeapp.network.RecipeService
import com.haslett.recipeapp.network.model.RecipeDtoMapper
import com.haslett.recipeapp.respository.RecipeRepository
import com.haslett.recipeapp.respository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepository_Impl(recipeService, recipeDtoMapper)
    }


}