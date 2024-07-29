package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class DashBoardFragment : Fragment() {

    lateinit var dashboarddetailsrecycle : RecyclerView
    lateinit var arrayItemOffers : ArrayList<DashboardItemOffersData>
    lateinit var adapterOffer : ItemOfferRecycle
    lateinit var categoryButton : TextView
    lateinit var recyclerItemsView: RecyclerView
    lateinit var horizontalRecycle: RecyclerView
    lateinit var rvadapter: ItemsRecycler
    lateinit var rvAdapterHorizontal: HorizontalRecycler
    lateinit var arrayItems: ArrayList<ItemsInDashBoard>
    lateinit var arrayProductimage: ArrayList<HorizontalRecycleData>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dash_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryButton = view.findViewById(R.id.categoriesButton)
        categoryButton.setOnClickListener {
            val categoryIntent = Intent(requireContext(), Categories::class.java)
            startActivity(categoryIntent)
        }


        dashboarddetailsrecycle= view.findViewById(R.id.dashboarddetailsrecycle)
        recyclerItemsView = view.findViewById(R.id.itemdashboardrecyler)
        horizontalRecycle = view.findViewById(R.id.horizontalRecycler)

        arrayItemOffers = ArrayList()
        arrayItemOffers.add(DashboardItemOffersData(R.drawable.b))
        arrayItemOffers.add(DashboardItemOffersData(R.drawable.b))
        arrayItemOffers.add(DashboardItemOffersData(R.drawable.b))
        adapterOffer=ItemOfferRecycle(requireContext(),arrayItemOffers)
        val horizontalView = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        dashboarddetailsrecycle.layoutManager=horizontalView
        dashboarddetailsrecycle.adapter=adapterOffer


        arrayProductimage = ArrayList()
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))
        arrayProductimage.add(HorizontalRecycleData(R.drawable.b))

        rvAdapterHorizontal = HorizontalRecycler(requireContext(), arrayProductimage)
        val horizontalLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        horizontalRecycle.layoutManager = horizontalLayoutManager
        horizontalRecycle.adapter = rvAdapterHorizontal

        arrayItems = ArrayList()
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))
        arrayItems.add(ItemsInDashBoard(R.drawable.b, "10%", "Meet"))

        rvadapter = ItemsRecycler(requireContext(), arrayItems)
        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        recyclerItemsView.layoutManager = gridLayoutManager
        recyclerItemsView.adapter = rvadapter
    }
}