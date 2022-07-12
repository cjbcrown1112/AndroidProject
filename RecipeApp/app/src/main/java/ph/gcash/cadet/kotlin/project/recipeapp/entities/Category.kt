package ph.gcash.cadet.kotlin.project.recipeapp.entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import ph.gcash.cadet.kotlin.project.recipeapp.entities.converter.CategoryListConverter

@Entity(tableName = "Category")
data class Category (

    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categoryitems")
    @Expose
    @SerializedName("categoriesItems")
    @TypeConverters(CategoryListConverter::class)
    var categoryitems: List<CategoryItems>? = null
)
