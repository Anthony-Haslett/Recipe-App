package com.haslett.recipeapp.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haslett.recipeapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val TAG: String = "AppDebug"
//
//    @Inject
//    lateinit var app: BaseApplication
//
//    @Inject
//    lateinit var randomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        Log.d(TAG, "onCreate: ${randomString}")
//        Log.d(TAG, "onCreate: ${app}")

        // region Retro fit
//        val service = Retrofit.Builder()
//            .baseUrl("https://food2fork.ca/api/recipe/")
//            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
//            .build()
//            .create(RecipeService::class.java)
//
//        CoroutineScope(IO).launch {
//            val recipe = service.get(
//                token = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48",
//                id = 583
//            )
//            Log.d("MainActivity", "onCreate: ${recipe.title}")
//        }
// endregion

//        val mapper = RecipeNetworkMapper()
//
//        val recipe = Recipe()
//
//        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)
//
//        val r: Recipe = mapper.mapFromEntity(networkEntity)
    }
}
