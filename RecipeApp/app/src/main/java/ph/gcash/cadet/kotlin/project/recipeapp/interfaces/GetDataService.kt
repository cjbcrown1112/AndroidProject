package ph.gcash.cadet.kotlin.project.recipeapp.interfaces

import ph.gcash.cadet.kotlin.project.recipeapp.entities.Category
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Meal
import ph.gcash.cadet.kotlin.project.recipeapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}