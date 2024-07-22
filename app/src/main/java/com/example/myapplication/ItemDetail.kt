package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemDetail : AppCompatActivity() {

    lateinit var itemDetailRecycleView : RecyclerView
    lateinit var itemDetailRecycleClass: ItemDetailRecycleClass
    lateinit var arrayList: ArrayList<ItemDetaildataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item_detail)
        itemDetailRecycleView = findViewById(R.id.itemDetailRecycleView)

        arrayList = ArrayList()
        arrayList.add(ItemDetaildataClass(R.drawable.b,1))
        arrayList.add(ItemDetaildataClass(R.drawable.b,2))
        arrayList.add(ItemDetaildataClass(R.drawable.b,3))
        arrayList.add(ItemDetaildataClass(R.drawable.b,4))
        arrayList.add(ItemDetaildataClass(R.drawable.b,5))

        val horizontalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        itemDetailRecycleView.layoutManager = horizontalLayoutManager
        itemDetailRecycleView.adapter = itemDetailRecycleClass

    }
}