package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class ItemsRecycler(
    private val context: Context,
    private val arrayList: ArrayList<ItemsInDashBoard>
) : RecyclerView.Adapter<ItemsRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.dashboaritemsvertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = arrayList[position]
        holder.bind(item)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageProd: ImageButton = itemView.findViewById(R.id.productImageButton)
        private val discountProd: TextView = itemView.findViewById(R.id.productDiscount)
        private val productName: TextView = itemView.findViewById(R.id.productname)
        private val addButton: Button = itemView.findViewById(R.id.productAddTocartButton)

        fun bind(item: ItemsInDashBoard) {
            imageProd.setImageResource(item.image)
            discountProd.text = item.discount
            productName.text = item.prodName
            addButton.setOnClickListener {
                //Toast.makeText(ItemsRecycler, "Item is added", Toast.LENGTH_LONG).show()
            }

        }
    }
}
