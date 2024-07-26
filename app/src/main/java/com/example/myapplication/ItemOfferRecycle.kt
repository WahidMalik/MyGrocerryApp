package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ReviewRecycle.ViewHolder

class ItemOfferRecycle(var context: Context,var array : ArrayList<DashboardItemOffersData>) : RecyclerView.Adapter<ItemOfferRecycle.OfferViewHolder>(){

    class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById<ImageView>(R.id.imageOffer)
        fun bind (item : DashboardItemOffersData){
            image.setImageResource(item.ImageOffer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.itemofferpic, parent, false)
        return OfferViewHolder(view)
    }

    override fun getItemCount(): Int {
       return array.size
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val view = array[position]
        holder.bind(view)
    }
}