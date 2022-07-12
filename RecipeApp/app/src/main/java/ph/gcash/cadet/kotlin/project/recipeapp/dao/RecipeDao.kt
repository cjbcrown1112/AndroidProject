package ph.gcash.cadet.kotlin.project.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Recipes

@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val allRecipes: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipes)
}