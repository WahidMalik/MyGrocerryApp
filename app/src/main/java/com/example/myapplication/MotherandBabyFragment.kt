package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MotherandBabyFragment : Fragment() {
    lateinit var spinnerClothes: Spinner
    lateinit var spinnerToys: Spinner
    lateinit var spinnerNursery: Spinner
    lateinit var spinnerGear: Spinner
    lateinit var spinnerFeeding: Spinner
    lateinit var spinnerHealth: Spinner
    lateinit var spinnerDipering: Spinner
    lateinit var arrayClothes: ArrayList<String>
    lateinit var arrayToys: ArrayList<String>
    lateinit var arrayNursery: ArrayList<String>
    lateinit var arrayGear: ArrayList<String>
    lateinit var arrayFeeding: ArrayList<String>
    lateinit var arrayHealth: ArrayList<String>
    lateinit var arrayDipering: ArrayList<String>
    lateinit var arrayClothesAdapter: ArrayAdapter<String>
    lateinit var arrayToysAdapter: ArrayAdapter<String>
    lateinit var arrayNurseryAdapter: ArrayAdapter<String>
    lateinit var arrayGearAdapter: ArrayAdapter<String>
    lateinit var arrayFeedingAdapter: ArrayAdapter<String>
    lateinit var arrayHealthAdapter: ArrayAdapter<String>
    lateinit var arrayDiperingAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motherand_baby, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerClothes = view.findViewById(R.id.spinnerClothes)
        spinnerToys = view.findViewById(R.id.spinnerToys)
        spinnerNursery = view.findViewById(R.id.spinnerNursery)
        spinnerGear = view.findViewById(R.id.spinnerGear)
        spinnerFeeding = view.findViewById(R.id.spinnerFeeding)
        spinnerHealth = view.findViewById(R.id.spinnerHealth)
        spinnerDipering = view.findViewById(R.id.spinnerDipering)

        arrayClothes = ArrayList()
        arrayToys = ArrayList()
        arrayNursery = ArrayList()
        arrayGear = ArrayList()
        arrayFeeding = ArrayList()
        arrayHealth = ArrayList()
        arrayDipering = ArrayList()

        arrayClothes.apply {
            add("Onesies")
            add("Rompers")
            add("Jackets")
            add("Sleepwear")
            add("Socks and Shoes")
        }
        arrayToys.apply {
            add("Educational Toys")
            add("Soft Toys")
            add("Activity Centers")
            add("Books")
            add("Outdoor Play")
        }
        arrayNursery.apply {
            add("Cribs and Bassinets")
            add("Bedding")
            add("Monitors")
            add("Furniture")
            add("Decor")
        }
        arrayGear.apply {
            add("Strollers")
            add("Car Seats")
            add("Baby Carriers")
            add("Swings and Bouncers")
            add("High Chairs")
        }
        arrayFeeding.apply {
            add("Bottles and Nipples")
            add("Breastfeeding Accessories")
            add("Baby Food")
            add("Highchairs")
            add("Bibs and Burp Cloths")
        }
        arrayHealth.apply {
            add("Baby Proofing")
            add("Health Monitors")
            add("Skincare")
            add("Bathing Essentials")
            add("First Aid")
        }
        arrayDipering.apply {
            add("Diapers")
            add("Wipes")
            add("Changing Pads")
            add("Diaper Bags")
            add("Potty Training")
        }

        arrayClothesAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayClothes)
        arrayClothesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerClothes.adapter = arrayClothesAdapter

        arrayToysAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayToys)
        arrayToysAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerToys.adapter = arrayToysAdapter

        arrayNurseryAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayNursery)
        arrayNurseryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerNursery.adapter = arrayNurseryAdapter

        arrayGearAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayGear)
        arrayGearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGear.adapter = arrayGearAdapter

        arrayFeedingAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayFeeding)
        arrayFeedingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFeeding.adapter = arrayFeedingAdapter

        arrayHealthAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayHealth)
        arrayHealthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerHealth.adapter = arrayHealthAdapter

        arrayDiperingAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayDipering)
        arrayDiperingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDipering.adapter = arrayDiperingAdapter

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
