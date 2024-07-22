package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchItemHorizontalRecycle(
    val context: Context,
    val array: ArrayList<SearchItemsHorizontal>
) : RecyclerView.Adapter<SearchItemHorizontalRecycle.ViewHolderSearchHorizontal>() {

    class ViewHolderSearchHorizontal(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageButton = itemView.findViewById(R.id.searchImageHorizontal)
        var categoryname: TextView = itemView.findViewById(R.id.searchcategotory)

        fun bind(item: SearchItemsHorizontal) {
            image.setImageResource(item.image)
            categoryname.text = item.categoryName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSearchHorizontal {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.searchitemshorizontal, parent, false)
        return ViewHolderSearchHorizontal(v)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolderSearchHorizontal, position: Int) {
        val item = array[position]
        holder.bind(item)
    }
}
