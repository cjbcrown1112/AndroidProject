package ph.gcash.cadet.kotlin.project.recipeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_sub_category.view.*
import ph.gcash.cadet.kotlin.project.recipeapp.R
import ph.gcash.cadet.kotlin.project.recipeapp.entities.Recipes

class SubCategoryAdapter:RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    var arrSubCategory = ArrayList<Recipes>()
    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(arrData : List<Recipes>){
        arrSubCategory = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category, parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        holder.itemView.tv_dish_name.text = arrSubCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }
}