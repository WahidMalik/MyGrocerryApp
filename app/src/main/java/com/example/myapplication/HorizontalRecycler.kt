package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class HorizontalRecycler(val context : Context,val itemsHorizontal: ArrayList<HorizontalRecycleData>) : RecyclerView.Adapter<HorizontalRecycler.ViewHolderHorizontal>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHorizontal {
        val view =
            LayoutInflater.from(context).inflate(R.layout.horizontalrecycler, parent, false)
        return ViewHolderHorizontal(view)
    }

    override fun onBindViewHolder(holder: ViewHolderHorizontal, position: Int) {
        val item = itemsHorizontal[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemsHorizontal.size
    }

    class ViewHolderHorizontal(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageButton: ImageButton = itemView.findViewById(R.id.imageHorizontal)

        fun bind(item: HorizontalRecycleData) {
            imageButton.setImageResource(item.image)
        }

    }
}