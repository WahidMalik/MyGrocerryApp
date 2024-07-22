package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoard : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        bottomNavigation = findViewById(R.id.bottomNavigation)
       
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeDashboardIcon -> {
                    loadFragment(DashBoardFragment())
                    true
                }
                R.id.cartIcon -> {
                    loadFragment(CartFragment())
                    true
                }
                R.id.searchDashboardIcon -> {
                    loadFragment(SearchFragment())
                    true
                }
                R.id.checklistIcon -> {
                    loadFragment(OrderFragment())
                    true
                }
                R.id.profileicon -> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

        // Set initial fragment
        if (savedInstanceState == null) {
            bottomNavigation.selectedItemId = R.id.homeDashboardIcon
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.dashboardFramelayout, fragment)
            .commit()
    }
}
