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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item_detail)
        itemDetailRecycleView = findViewById(R.id.itemDetailRecycleView)
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
    }
}
