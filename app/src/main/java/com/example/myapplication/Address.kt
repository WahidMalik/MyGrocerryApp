package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Address : AppCompatActivity() {

    lateinit var addressToolbar : Toolbar
    lateinit var permanentEditAddressButton : TextView
    lateinit var tempEditAddressButton : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_address)

        permanentEditAddressButton = findViewById(R.id.permanentEditAddressButton)
        tempEditAddressButton = findViewById(R.id.tempEditAddressButton)
        addressToolbar = findViewById(R.id.addressProfileToolbar)
        addressToolbar.title = "Address"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        permanentEditAddressButton.setOnClickListener {
            val intent = Intent(this, AddressEdit::class.java)
            startActivity(intent)
        }
        tempEditAddressButton.setOnClickListener {
            val intent = Intent(this, AddressEdit::class.java)
            startActivity(intent)
        }

    }
}