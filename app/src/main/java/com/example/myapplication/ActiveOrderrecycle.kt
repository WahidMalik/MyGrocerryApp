package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActiveOrderrecycle(private val context: Context, private val itemsActiveOrder: ArrayList<ActiveOrderData>) :
    RecyclerView.Adapter<ActiveOrderrecycle.ViewHolderActiveOrder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActiveOrder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.activeorderstyle, parent, false)
        return ViewHolderActiveOrder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderActiveOrder, position: Int) {
        val item = itemsActiveOrder[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemsActiveOrder.size
    }

    class ViewHolderActiveOrder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.activeorderImage)
        private val orderProduct: TextView = itemView.findViewById(R.id.activeOrderproductId)
        private val orderBrand: TextView = itemView.findViewById(R.id.activeOrderbrandId)
        private val orderPrice: TextView = itemView.findViewById(R.id.activeOrderpriceId)
        private val orderProcessing: TextView = itemView.findViewById(R.id.activeOrderpocessingId)
        private val orderTrackButton: TextView = itemView.findViewById(R.id.activeOrderTrackbuttonId)

        fun bind(item: ActiveOrderData) {
            image.setImageResource(item.image)
            orderProduct.text = item.productId
            orderBrand.text = item.brandId
            orderPrice.text = "Rs. ${item.priceId}"
            orderProcessing.text = item.process
            orderTrackButton.setOnClickListener {
                val intent = Intent(itemView.context, TrackOrder::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }
}
