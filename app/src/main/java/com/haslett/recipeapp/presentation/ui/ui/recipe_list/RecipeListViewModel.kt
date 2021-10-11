package com.haslett.recipeapp.presentation.ui.ui.recipe_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.haslett.recipeapp.domain.model.Recipe
import com.haslett.recipeapp.respository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val repository: RecipeRepository,
    private @Named("auth_token") val token: String,

    ) : ViewModel() {

    val recipes: MutableState<List<Recipe>> = mutableStateOf(listOf())
    val query = mutableStateOf("")
    
    val selectedCategory: MutableState<FoodCategory?> = mutableStateOf(null)
    
    var categoryScrollPosition: Float = 0f

    init {
        newSearch()
    }

    fun newSearch() {
        viewModelScope.launch {
            val result = repository.search(
                token = token,
                page = 1,
                query = query.value
            )
            recipes.value = result
        }
    }

    fun onQueryChanged(query: String) {
        this.query.value = query
    }
    
    fun onSelectedCategoryChanged(category: String) {
        val newCategory = getFoodCategory(category)
        selectedCategory.value = newCategory
        onQueryChanged(category)
    }
    
    fun onChangeCategoryScrollPosition(position: Float) {
        categoryScrollPosition = position
    }
}
