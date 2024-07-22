package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemDetailRecycleClass(
    private val context: Context,
    private val arrayList: ArrayList<ItemDetaildataClass>
) : RecyclerView.Adapter<ItemDetailRecycleClass.ItemDetailViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemDetailViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemdetailstylehorizontal, parent, false)
        return ItemDetailViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ItemDetailViewHolder,
        position: Int
    ) {
        val item = arrayList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.product_image)
        private val count: TextView = itemView.findViewById(R.id.image_count)

        fun bind(item: ItemDetaildataClass) {
            image.setImageResource(item.product_image)
            count.text = " ${item.image_count}"
        }
    }
}
