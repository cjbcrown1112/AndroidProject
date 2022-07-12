package ph.gcash.cadet.kotlin.project.recipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ph.gcash.cadet.kotlin.project.recipeapp.dao.RecipeDao
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Category
import ph.gcash.cadet.kotlin.project.recipeapp.entities.CategoryItems
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Recipes
import ph.gcash.cadet.kotlin.project.recipeapp.entities.converter.CategoryListConverter

@Database(entities = [Recipes::class, CategoryItems::class, Category::class, CategoryListConverter::class], version = 1, exportSchema = false)
abstract class RecipeDatabase: RoomDatabase() {

    companion object{

        var recipeDatabase:RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if(recipeDatabase != null) {
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }

    abstract fun recipeDao():RecipeDao
}