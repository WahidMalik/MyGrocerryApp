package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemDetailRecycleClass(var context : Context, var arrayList: ArrayList<ItemDetaildataClass>) : RecyclerView.Adapter<ItemDetailRecycleClass.ItemDetailViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemDetailRecycleClass.ItemDetailViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemdetailstylehorizontal,parent,false)
        return ItemDetailViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ItemDetailRecycleClass.ItemDetailViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.product_image)
        val count = itemView.findViewById<TextView>(R.id.image_count)

        fun bind (item : ItemDetaildataClass){
            image.setImageResource(item.product_image)
            count.text = " ${item.image_count}"
        }


    }
}