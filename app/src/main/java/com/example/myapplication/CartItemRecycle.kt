package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartItemRecycle(private val context: Context, private val cartItems: ArrayList<CartDetails>) :
    RecyclerView.Adapter<CartItemRecycle.CartItemViewHolder>() {

    class CartItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cartCheckBox: CheckBox = itemView.findViewById(R.id.cartCheckBox)
        val cartItemImage: ImageView = itemView.findViewById(R.id.cartItemImage)
        val cartProductName: TextView = itemView.findViewById(R.id.cartProductName)
        val cartProductBrandName: TextView = itemView.findViewById(R.id.cartProductBrandName)
        val cartProductAmount: TextView = itemView.findViewById(R.id.cartProductAmount)
        val cartDeleteIcon: ImageView = itemView.findViewById(R.id.cartDeleteIcon)
        val cartMinus: TextView = itemView.findViewById(R.id.cartMinus)
        val cartProductQuantity: TextView = itemView.findViewById(R.id.cartProductQuantity)
        val cartPlus: TextView = itemView.findViewById(R.id.cartPlus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartItemViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.cartstyle, parent, false)
        return CartItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartItemViewHolder, position: Int) {
        val currentItem = cartItems[position]
        holder.cartItemImage.setImageResource(currentItem.image)
        holder.cartProductName.text = currentItem.itemName
        holder.cartProductBrandName.text = currentItem.companyName
        holder.cartProductAmount.text = "Rs. ${currentItem.price}"
        holder.cartProductQuantity.text = currentItem.quantity.toString()

        // Set onClickListeners for buttons (e.g., cartMinus, cartPlus, cartDeleteIcon) if needed
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }
}
