package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment

class GrocerryFragment : Fragment() {
    lateinit var spinnerBreakfast: Spinner
    lateinit var spinnerfreshProduce: Spinner
    lateinit var spinnerFoodstaples: Spinner
    lateinit var spinnerBeverages: Spinner
    lateinit var spinnerFrozenfood: Spinner
    lateinit var spinnerLoundary: Spinner
    lateinit var spinnerAnimals: Spinner
    lateinit var arrayBreakfast: ArrayList<String>
    lateinit var arrayfreshProduce: ArrayList<String>
    lateinit var arrayFoodstaples: ArrayList<String>
    lateinit var arrayBeverages: ArrayList<String>
    lateinit var arrayFrozenfood: ArrayList<String>
    lateinit var arrayLoundary: ArrayList<String>
    lateinit var arrayAnimals: ArrayList<String>
    lateinit var arrayBreakfastAdapter: ArrayAdapter<String>
    lateinit var arrayfreshProduceAdapter: ArrayAdapter<String>
    lateinit var arrayFoodstaplesAdapter: ArrayAdapter<String>
    lateinit var arrayBeveragesAdapter: ArrayAdapter<String>
    lateinit var arrayFrozenfoodAdapter: ArrayAdapter<String>
    lateinit var arrayLoundaryAdapter: ArrayAdapter<String>
    lateinit var arrayAnimalsAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grocerry, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        spinnerBreakfast = view.findViewById(R.id.spinnerbreakfast)
        spinnerfreshProduce = view.findViewById(R.id.spinnerfreshProduce)
        spinnerFoodstaples = view.findViewById(R.id.spinnerfoodstaples)
        spinnerBeverages = view.findViewById(R.id.spinnerbeverages)
        spinnerFrozenfood = view.findViewById(R.id.spinnerfrozenfood)
        spinnerLoundary = view.findViewById(R.id.spinnerloundary)
        spinnerAnimals = view.findViewById(R.id.spinneranimalfood)

        arrayBreakfast = ArrayList()
        arrayfreshProduce = ArrayList()
        arrayFoodstaples = ArrayList()
        arrayBeverages = ArrayList()
        arrayFrozenfood = ArrayList()
        arrayLoundary = ArrayList()
        arrayAnimals = ArrayList()

        arrayfreshProduce.apply {
            add("Fresh Produce")
            add("Fresh Produce")
            add("Fresh Produce")
            add("Fresh Produce")
            add("Fresh Produce")
        }
        arrayBreakfast.apply {
            add("Breakfast")
            add("Breakfast")
            add("Breakfast")
            add("Breakfast")
            add("Breakfast")
        }
        arrayBeverages.apply {
            add("Beverages")
            add("Beverages")
            add("Beverages")
            add("Beverages")
            add("Beverages")
        }
        arrayFoodstaples.apply {
            add("Food Staples")
            add("Food Staples")
            add("Food Staples")
            add("Food Staples")
        }
        arrayLoundary.apply {
            add("Loundary")
            add("Loundary")
            add("Loundary")
            add("Loundary")
            add("Loundary")
        }
        arrayAnimals.apply {
            add("Animals")
            add("Animals")
            add("Animals")
            add("Animals")
            add("Animals")
        }
        arrayFrozenfood.apply {
            add("Frozen Food")
            add("Frozen Food")
            add("Frozen Food")
            add("Frozen Food")
            add("Frozen Food")
        }

        arrayBreakfastAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayBreakfast)
        arrayBreakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBreakfast.adapter = arrayBreakfastAdapter

        arrayfreshProduceAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayfreshProduce)
        arrayfreshProduceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerfreshProduce.adapter = arrayfreshProduceAdapter

        arrayFoodstaplesAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayFoodstaples)
        arrayFoodstaplesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFoodstaples.adapter = arrayFoodstaplesAdapter

        arrayBeveragesAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayBeverages)
        arrayBeveragesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBeverages.adapter = arrayBeveragesAdapter

        arrayFrozenfoodAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayFrozenfood)
        arrayFrozenfoodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFrozenfood.adapter = arrayFrozenfoodAdapter

        arrayLoundaryAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayLoundary)
        arrayLoundaryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerLoundary.adapter = arrayLoundaryAdapter

        arrayAnimalsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayAnimals)
        arrayAnimalsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerAnimals.adapter = arrayAnimalsAdapter

        setSpinnerListeners()
    }

    private fun setSpinnerListeners() {
        val spinnerListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(requireContext(), "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle the case when no item is selected, if needed
            }
        }

//        spinnerBreakfast.onItemSelectedListener = spinnerListener
//        spinnerfreshProduce.onItemSelectedListener = spinnerListener
//        spinnerFoodstaples.onItemSelectedListener = spinnerListener
//        spinnerBeverages.onItemSelectedListener = spinnerListener
//        spinnerFrozenfood.onItemSelectedListener = spinnerListener
//        spinnerLoundary.onItemSelectedListener = spinnerListener
//        spinnerAnimals.onItemSelectedListener = spinnerListener
    }
}
