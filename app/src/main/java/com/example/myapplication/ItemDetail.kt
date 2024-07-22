package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemDetail : AppCompatActivity() {

    lateinit var toolbar : Toolbar
    private lateinit var itemDetailRecycleView: RecyclerView
    private lateinit var itemDetailRecycleClass: ItemDetailRecycleClass
    private lateinit var arrayList: ArrayList<ItemDetaildataClass>
    lateinit var reviewRecycleView : RecyclerView
    lateinit var arrayReviewData : ArrayList<ReviewData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item_detail)
        itemDetailRecycleView = findViewById(R.id.itemDetailRecycleView)
        reviewRecycleView = findViewById(R.id.revieRecycle)
        toolbar = findViewById(R.id.toolbarItemdetail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        arrayList = ArrayList()
        arrayList.add(ItemDetaildataClass(R.drawable.b, 1))
        arrayList.add(ItemDetaildataClass(R.drawable.b, 2))
        arrayList.add(ItemDetaildataClass(R.drawable.b, 3))
        arrayList.add(ItemDetaildataClass(R.drawable.b, 4))
        arrayList.add(ItemDetaildataClass(R.drawable.b, 5))

        itemDetailRecycleClass = ItemDetailRecycleClass(this, arrayList)
        val horizontalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        itemDetailRecycleView.layoutManager = horizontalLayoutManager
        itemDetailRecycleView.adapter = itemDetailRecycleClass

        arrayReviewData = ArrayList()
        arrayReviewData.add(ReviewData(R.drawable.profileicon,"Wahid","Wow ver nice",R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,4.5f))
        arrayReviewData.add(ReviewData(R.drawable.profileicon,"Wahid","Wow ver nice",R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,5.0f))
        arrayReviewData.add(ReviewData(R.drawable.profileicon,"Wahid","Wow ver nice",R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,2.5f))
        arrayReviewData.add(ReviewData(R.drawable.profileicon,"Wahid","Wow ver nice",R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,3.5f))
        arrayReviewData.add(ReviewData(R.drawable.profileicon,"Wahid","Wow ver nice",R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,1.3f))

        reviewRecycleView.layoutManager = LinearLayoutManager(this)
        reviewRecycleView.adapter = ReviewRecycle(this, arrayReviewData)




    }
}
