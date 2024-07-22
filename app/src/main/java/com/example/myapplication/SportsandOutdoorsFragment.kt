package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

class SportsandOutdoorsFragment : Fragment() {
    lateinit var spinnerFitness: Spinner
    lateinit var spinnerCamping: Spinner
    lateinit var spinnerCycling: Spinner
    lateinit var spinnerTeamSports: Spinner
    lateinit var spinnerWaterSports: Spinner
    lateinit var spinnerWinterSports: Spinner
    lateinit var spinnerOutdoorRecreation: Spinner
    lateinit var arrayFitness: ArrayList<String>
    lateinit var arrayCamping: ArrayList<String>
    lateinit var arrayCycling: ArrayList<String>
    lateinit var arrayTeamSports: ArrayList<String>
    lateinit var arrayWaterSports: ArrayList<String>
    lateinit var arrayWinterSports: ArrayList<String>
    lateinit var arrayOutdoorRecreation: ArrayList<String>
    lateinit var arrayFitnessAdapter: ArrayAdapter<String>
    lateinit var arrayCampingAdapter: ArrayAdapter<String>
    lateinit var arrayCyclingAdapter: ArrayAdapter<String>
    lateinit var arrayTeamSportsAdapter: ArrayAdapter<String>
    lateinit var arrayWaterSportsAdapter: ArrayAdapter<String>
    lateinit var arrayWinterSportsAdapter: ArrayAdapter<String>
    lateinit var arrayOutdoorRecreationAdapter: ArrayAdapter<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sportsand_outdoors, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerFitness = view.findViewById(R.id.spinnerFitness)
        spinnerCamping = view.findViewById(R.id.spinnerCamping)
        spinnerCycling = view.findViewById(R.id.spinnerCycling)
        spinnerTeamSports = view.findViewById(R.id.spinnerTeamSports)
        spinnerWaterSports = view.findViewById(R.id.spinnerWaterSports)
        spinnerWinterSports = view.findViewById(R.id.spinnerWinterSports)
        spinnerOutdoorRecreation = view.findViewById(R.id.spinnerOutdoorRecreation)

        arrayFitness = ArrayList()
        arrayCamping = ArrayList()
        arrayCycling = ArrayList()
        arrayTeamSports = ArrayList()
        arrayWaterSports = ArrayList()
        arrayWinterSports = ArrayList()
        arrayOutdoorRecreation = ArrayList()

        arrayFitness.apply {
            add("Yoga Mats")
            add("Dumbbells")
            add("Treadmills")
            add("Resistance Bands")
            add("Fitness Trackers")
        }
        arrayCamping.apply {
            add("Tents")
            add("Sleeping Bags")
            add("Camping Furniture")
            add("Camp Kitchen")
            add("Backpacks")
        }
        arrayCycling.apply {
            add("Bicycles")
            add("Helmets")
            add("Cycling Apparel")
            add("Bike Accessories")
            add("Bike Tools")
        }
        arrayTeamSports.apply {
            add("Soccer")
            add("Basketball")
            add("Baseball")
            add("Volleyball")
            add("Football")
        }
        arrayWaterSports.apply {
            add("Swimwear")
            add("Surfing")
            add("Diving")
            add("Water Skiing")
            add("Kayaking")
        }
        arrayWinterSports.apply {
            add("Skiing")
            add("Snowboarding")
            add("Ice Skating")
            add("Snowshoeing")
            add("Winter Apparel")
        }
        arrayOutdoorRecreation.apply {
            add("Hiking")
            add("Fishing")
            add("Climbing")
            add("Hunting")
            add("Outdoor Apparel")
        }

        arrayFitnessAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayFitness)
        arrayFitnessAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFitness.adapter = arrayFitnessAdapter

        arrayCampingAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayCamping)
        arrayCampingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCamping.adapter = arrayCampingAdapter

        arrayCyclingAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayCycling)
        arrayCyclingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerCycling.adapter = arrayCyclingAdapter

        arrayTeamSportsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayTeamSports)
        arrayTeamSportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTeamSports.adapter = arrayTeamSportsAdapter

        arrayWaterSportsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayWaterSports)
        arrayWaterSportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerWaterSports.adapter = arrayWaterSportsAdapter

        arrayWinterSportsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayWinterSports)
        arrayWinterSportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerWinterSports.adapter = arrayWinterSportsAdapter

        arrayOutdoorRecreationAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayOutdoorRecreation)
        arrayOutdoorRecreationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOutdoorRecreation.adapter = arrayOutdoorRecreationAdapter
    }
}
