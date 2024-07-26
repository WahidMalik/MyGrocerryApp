package com.example.myapplication

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Categories : AppCompatActivity() {

    lateinit var toolbarForyou: Toolbar
    lateinit var justforbtn: ImageButton
    lateinit var groceriesandpetsbtn: ImageButton
    lateinit var motherandbabybtn: ImageButton
    lateinit var houseandlifestyle: ImageButton
    lateinit var sportsandpoutdoors: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_foryou)
        toolbarForyou = findViewById(R.id.toolbarForyou)
        justforbtn = findViewById(R.id.justforyoubtn)
        groceriesandpetsbtn = findViewById(R.id.grocerryandpetsbtn)
        motherandbabybtn = findViewById(R.id.motherandbabybtn)
        houseandlifestyle = findViewById(R.id.homeandstylebtn)
        sportsandpoutdoors = findViewById(R.id.sportsandourdoorsbtn)
        setSupportActionBar(toolbarForyou)
        supportActionBar?.title="Categories"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        loadFragment(JustForyouFragment())
        justforbtn.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)

        justforbtn.setOnClickListener {
            resetButtonColors()
            justforbtn.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)
            loadFragment(JustForyouFragment())
        }

        groceriesandpetsbtn.setOnClickListener {
            resetButtonColors()
            groceriesandpetsbtn.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)
            loadFragment(GrocerryFragment())
        }

        motherandbabybtn.setOnClickListener {
            resetButtonColors()
            motherandbabybtn.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)
            loadFragment(MotherandBabyFragment())
        }

        houseandlifestyle.setOnClickListener {
            resetButtonColors()
            houseandlifestyle.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)
            loadFragment(HomeandLifestyleFragment())
        }

        sportsandpoutdoors.setOnClickListener {
            resetButtonColors()
            sportsandpoutdoors.setColorFilter(Color.parseColor("#E17F00"), PorterDuff.Mode.SRC_IN)
            loadFragment(SportsandOutdoorsFragment())
        }
    }

    private fun resetButtonColors() {
        justforbtn.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
        groceriesandpetsbtn.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
        motherandbabybtn.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
        houseandlifestyle.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
        sportsandpoutdoors.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
    }

    private fun loadFragment(fragment: Fragment) {
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.foryoyframe, fragment)
        ft.commit()
    }
}
