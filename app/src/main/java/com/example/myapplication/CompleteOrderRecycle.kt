package com.example.myapplication

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ActiveOrderrecycle.ViewHolderActiveOrder

class CompleteOrderRecycle(var context: Context, var arrayCompleteOrder: ArrayList<CompleteOrderData>): RecyclerView.Adapter<CompleteOrderRecycle.ViewHolderComplete>() {

    class ViewHolderComplete(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val image: ImageView = itemView.findViewById(R.id.completeorderImage)
        private val orderProduct: TextView = itemView.findViewById(R.id.completeOrderproductId)
        private val orderBrand: TextView = itemView.findViewById(R.id.completeOrderbrandId)
        private val orderPrice: TextView = itemView.findViewById(R.id.completeOrderprice)
        private val reviewOrderButton : Button = itemView.findViewById(R.id.reviewOrderButton)

        fun bind(item: CompleteOrderData) {
            image.setImageResource(item.image)
            orderProduct.text = item.productId
            orderBrand.text = item.brandId
            orderPrice.text = "Rs. ${item.priceId}"
            reviewOrderButton.setOnClickListener {
                var dialog = Dialog(itemView.context)
                dialog.setContentView(R.layout.reviewdialog)
                dialog.setCancelable(false)
                dialog.show()
                val submitButton = dialog.findViewById<Button>(R.id.submitButton)
                val cancelButton = dialog.findViewById<Button>(R.id.cancelButton)
                submitButton.setOnClickListener {
                    dialog.dismiss()
                }
                cancelButton.setOnClickListener {
                    dialog.dismiss()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderComplete {
        val itemView = LayoutInflater.from(context).inflate(R.layout.completeorderstyle, parent, false)
        return ViewHolderComplete(itemView)
    }

    override fun getItemCount(): Int {
        return arrayCompleteOrder.size
    }

    override fun onBindViewHolder(holder: ViewHolderComplete, position: Int) {
        val itemComplete = arrayCompleteOrder[position]
        holder.bind(itemComplete)

    }
}