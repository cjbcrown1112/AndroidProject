package ph.gcash.cadet.kotlin.project.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Category
import ph.gcash.cadet.kotlin.project.recipeapp.entities.CategoryItems
import ph.gcash.cadet.kotlin.project.recipeapp.entities.MealsItems
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Recipes

@Dao
interface RecipeDao {

    @Query("SELECT * FROM catergoryitems ORDER BY id DESC")
    suspend fun getAllCategory() : List<CategoryItems>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(categoryItems: CategoryItems?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(mealsItems: MealsItems?)

    @Query("DELETE FROM catergoryitems")
    suspend fun clearDb()

    @Query("SELECT * FROM MealItems WHERE categoryName = :categoryName ORDER BY id DESC")
    suspend fun getSpecificMealList(categoryName:String) : List<MealsItems>
}