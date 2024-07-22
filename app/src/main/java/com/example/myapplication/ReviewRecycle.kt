package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewRecycle(var context : Context, var arrayList: ArrayList<ReviewData>): RecyclerView.Adapter<ReviewRecycle.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewRecycle.ViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.reviewlayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewRecycle.ViewHolder, position: Int) {
        val data = arrayList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val Reviewerpic =itemView.findViewById<ImageView>(R.id.reviewCustomerImage)
        val ReviewerName = itemView.findViewById<TextView>(R.id.customerReviewName)
        val Rating = itemView.findViewById<RatingBar>(R.id.reviewratings)
        val ReviewText = itemView.findViewById<TextView>(R.id.reviewtext)
        val ReviewImage1 = itemView.findViewById<ImageView>(R.id.ReviewImage1)
        val ReviewImage2 = itemView.findViewById<ImageView>(R.id.ReviewImage2)
        val ReviewImage3 = itemView.findViewById<ImageView>(R.id.ReviewImage3)
        val ReviewImage4 = itemView.findViewById<ImageView>(R.id.ReviewImage4)
        val ReviewImage5 = itemView.findViewById<ImageView>(R.id.ReviewImage5)

        fun bind(data: ReviewData) {
            Reviewerpic.setImageResource(data.personImage)
            ReviewerName.text = data.personName
            Rating.rating = data.reviewRating
            ReviewText.text = data.personComment
            ReviewImage1.setImageResource(data.reviewImage1)
            ReviewImage2.setImageResource(data.reviewImage2)
            ReviewImage3.setImageResource(data.reviewImage3)
            ReviewImage4.setImageResource(data.reviewImage4)
            ReviewImage5.setImageResource(data.reviewImage5)
        }

    }
}