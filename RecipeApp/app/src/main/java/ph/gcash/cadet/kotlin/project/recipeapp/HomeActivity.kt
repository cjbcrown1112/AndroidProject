package ph.gcash.cadet.kotlin.project.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import ph.gcash.cadet.kotlin.project.recipeapp.adapter.MainCategoryAdapter
import ph.gcash.cadet.kotlin.project.recipeapp.adapter.SubCategoryAdapter
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Recipes

class HomeActivity : AppCompatActivity() {

    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()
    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        arrMainCategory.add(Recipes(1, "Beef"))
        arrMainCategory.add(Recipes(2, "Chicken"))
        arrMainCategory.add(Recipes(3, "Dessert"))
        arrMainCategory.add(Recipes(4, "Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Beef and Mustard Pie"))
        arrSubCategory.add(Recipes(2, "Chicken and Mushroom Hotpot"))
        arrSubCategory.add(Recipes(3, "Banana Pancakes"))
        arrSubCategory.add(Recipes(4, "Kapsalon"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter = subCategoryAdapter

    }
}