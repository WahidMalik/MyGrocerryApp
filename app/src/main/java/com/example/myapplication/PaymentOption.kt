package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class PaymentOption : AppCompatActivity() {

    private lateinit var paymenttoolbar : Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment_option)

        paymenttoolbar = findViewById(R.id.paymenttoolbar)
        setSupportActionBar(paymenttoolbar)
        supportActionBar?.title = "Payment Option"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }
}