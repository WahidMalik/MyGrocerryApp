package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrderActiveFragment : Fragment() {

    private lateinit var arrayActiveOrder: ArrayList<ActiveOrderData>
    private lateinit var activeOrderRecycle: RecyclerView
    private lateinit var orderAdapter: ActiveOrderrecycle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order_active, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arrayActiveOrder = ArrayList()
        arrayActiveOrder.add(ActiveOrderData(R.drawable.b, "Sunsilk", "John", 550))
        arrayActiveOrder.add(ActiveOrderData(R.drawable.b, "Sunsilk", "John", 550))
        arrayActiveOrder.add(ActiveOrderData(R.drawable.b, "Sunsilk", "John", 550))
        arrayActiveOrder.add(ActiveOrderData(R.drawable.b, "Sunsilk", "John", 550))

        activeOrderRecycle = view.findViewById(R.id.activeOrderRecycleView)
        activeOrderRecycle.layoutManager = LinearLayoutManager(requireContext())
        orderAdapter = ActiveOrderrecycle(requireContext(), arrayActiveOrder)
        activeOrderRecycle.adapter = orderAdapter
    }
}
