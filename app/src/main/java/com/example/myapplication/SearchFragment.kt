package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchFragment : Fragment() {

    private lateinit var array: ArrayList<SearchItemsHorizontal>
    private lateinit var searchItemHorizontalRecycle: RecyclerView
    private lateinit var rvadapter: SearchItemHorizontalRecycle

    private lateinit var searchVerticalRecycle: RecyclerView
    private lateinit var arrayvertical: ArrayList<SearchItemVertical>
    private lateinit var rvadapterVertical: SearchItemVerticalRecycler

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchItemHorizontalRecycle = view.findViewById(R.id.searchitemshorizontal)
        searchVerticalRecycle = view.findViewById(R.id.searchVerticalRecycle)

        // Sample data for horizontal RecyclerView
        array = ArrayList()
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))
        array.add(SearchItemsHorizontal(R.drawable.b, "Floor"))

        rvadapter = SearchItemHorizontalRecycle(requireContext(), array)
        val horizontalLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        searchItemHorizontalRecycle.layoutManager = horizontalLayoutManager
        searchItemHorizontalRecycle.adapter = rvadapter

        // Sample data for vertical RecyclerView
        arrayvertical = ArrayList()
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Sunsilk", "4.5/5", "Rs 550", "Rs 700"))
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Clear", "4.5/5", "Rs 350", "Rs 700"))
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Head and Shoulder", "4.5/5", "Rs 250", "Rs 700"))
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Pentene", "4.5/5", "Rs 500", "Rs 700"))
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Vatica", "4.5/5", "Rs 400", "Rs 700"))
        arrayvertical.add(SearchItemVertical(R.drawable.b, "Lifebouy", "4.5/5", "Rs 580", "Rs 700"))

        rvadapterVertical = SearchItemVerticalRecycler(requireContext(), arrayvertical)
        val gridLayoutManager = GridLayoutManager(requireContext(), 2)
        searchVerticalRecycle.layoutManager = gridLayoutManager
        searchVerticalRecycle.adapter = rvadapterVertical
    }
}
