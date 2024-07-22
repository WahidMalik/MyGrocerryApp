package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

class HomeandLifestyleFragment : Fragment() {
    lateinit var spinnerFurniture: Spinner
    lateinit var spinnerDecor: Spinner
    lateinit var spinnerKitchen: Spinner
    lateinit var spinnerBedding: Spinner
    lateinit var spinnerBath: Spinner
    lateinit var spinnerStorage: Spinner
    lateinit var spinnerOutdoor: Spinner
    lateinit var arrayFurniture: ArrayList<String>
    lateinit var arrayDecor: ArrayList<String>
    lateinit var arrayKitchen: ArrayList<String>
    lateinit var arrayBedding: ArrayList<String>
    lateinit var arrayBath: ArrayList<String>
    lateinit var arrayStorage: ArrayList<String>
    lateinit var arrayOutdoor: ArrayList<String>
    lateinit var arrayFurnitureAdapter: ArrayAdapter<String>
    lateinit var arrayDecorAdapter: ArrayAdapter<String>
    lateinit var arrayKitchenAdapter: ArrayAdapter<String>
    lateinit var arrayBeddingAdapter: ArrayAdapter<String>
    lateinit var arrayBathAdapter: ArrayAdapter<String>
    lateinit var arrayStorageAdapter: ArrayAdapter<String>
    lateinit var arrayOutdoorAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homeand_lifestyle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerFurniture = view.findViewById(R.id.spinnerFurniture)
        spinnerDecor = view.findViewById(R.id.spinnerDecor)
        spinnerKitchen = view.findViewById(R.id.spinnerKitchen)
        spinnerBedding = view.findViewById(R.id.spinnerBedding)
        spinnerBath = view.findViewById(R.id.spinnerBath)
        spinnerStorage = view.findViewById(R.id.spinnerStorage)
        spinnerOutdoor = view.findViewById(R.id.spinnerOutdoor)

        arrayFurniture = ArrayList()
        arrayDecor = ArrayList()
        arrayKitchen = ArrayList()
        arrayBedding = ArrayList()
        arrayBath = ArrayList()
        arrayStorage = ArrayList()
        arrayOutdoor = ArrayList()

        arrayFurniture.apply {
            add("Sofas")
            add("Chairs")
            add("Tables")
            add("Cabinets")
            add("Shelves")
        }
        arrayDecor.apply {
            add("Wall Art")
            add("Lighting")
            add("Rugs")
            add("Curtains")
            add("Mirrors")
        }
        arrayKitchen.apply {
            add("Cookware")
            add("Tableware")
            add("Appliances")
            add("Storage")
            add("Utensils")
        }
        arrayBedding.apply {
            add("Sheets")
            add("Pillows")
            add("Duvets")
            add("Blankets")
            add("Mattresses")
        }
        arrayBath.apply {
            add("Towels")
            add("Shower Curtains")
            add("Bath Mats")
            add("Bath Accessories")
            add("Storage")
        }
        arrayStorage.apply {
            add("Closet Organizers")
            add("Baskets and Bins")
            add("Shelving Units")
            add("Storage Boxes")
            add("Hooks and Hangers")
        }
        arrayOutdoor.apply {
            add("Patio Furniture")
            add("Garden Decor")
            add("Grills")
            add("Outdoor Lighting")
            add("Outdoor Rugs")
        }

        arrayFurnitureAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayFurniture)
        arrayFurnitureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFurniture.adapter = arrayFurnitureAdapter

        arrayDecorAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayDecor)
        arrayDecorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDecor.adapter = arrayDecorAdapter

        arrayKitchenAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayKitchen)
        arrayKitchenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerKitchen.adapter = arrayKitchenAdapter

        arrayBeddingAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayBedding)
        arrayBeddingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBedding.adapter = arrayBeddingAdapter

        arrayBathAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayBath)
        arrayBathAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBath.adapter = arrayBathAdapter

        arrayStorageAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayStorage)
        arrayStorageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerStorage.adapter = arrayStorageAdapter

        arrayOutdoorAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayOutdoor)
        arrayOutdoorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOutdoor.adapter = arrayOutdoorAdapter
    }
}
