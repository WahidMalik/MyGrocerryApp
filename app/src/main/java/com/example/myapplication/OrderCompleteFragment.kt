package com.example.myapplication

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class OrderCompleteFragment : Fragment() {

    private lateinit var arrayCompleteOrder: ArrayList<CompleteOrderData>
    private lateinit var completeOrderRecycle: RecyclerView
    private lateinit var orderAdapter: CompleteOrderRecycle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order_complete, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arrayCompleteOrder = ArrayList()
        arrayCompleteOrder.add(CompleteOrderData(R.drawable.b, "Sunsilk", "John", 550,R.drawable.smallbutton))



        completeOrderRecycle = view.findViewById(R.id.completeOrderRecycleView)
        completeOrderRecycle.layoutManager = LinearLayoutManager(requireContext())
        orderAdapter = CompleteOrderRecycle(requireContext(), arrayCompleteOrder)
        completeOrderRecycle.adapter = orderAdapter

    }


}
