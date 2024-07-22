package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchItemVerticalRecycler(private val context: Context, private val arrayList: ArrayList<SearchItemVertical>)
    : RecyclerView.Adapter<SearchItemVerticalRecycler.ViewHolderSearchVertical>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSearchVertical {
        val v = LayoutInflater.from(context).inflate(R.layout.searchverticalrecycle, parent, false)
        return ViewHolderSearchVertical(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolderSearchVertical, position: Int) {
        val item = arrayList[position]
        holder.bind(item)
    }

    inner class ViewHolderSearchVertical(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.searchVerticalImage)
        private val heart: ImageView = itemView.findViewById(R.id.searchVerticalHeart)
        private val itemName: TextView = itemView.findViewById(R.id.searchItemName)
        private val rating: TextView = itemView.findViewById(R.id.searchItemRating)
        private val price: TextView = itemView.findViewById(R.id.searchItemPrice)

        fun bind(item: SearchItemVertical) {
            image.setImageResource(item.image)
            itemName.text = item.itemName
            rating.text = item.rating
            price.text = item.price
        }
    }
}
