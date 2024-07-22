package com.example.myapplication

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Checkout : AppCompatActivity() {


    lateinit var paymentoption : TextView
    lateinit var checkoutToolbar: Toolbar
    lateinit var checkoutButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkout)

        checkoutToolbar = findViewById(R.id.checkoutToolbar)
        setSupportActionBar(checkoutToolbar)
        supportActionBar?.title="Checkout"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        checkoutButton = findViewById(R.id.placeOrderButton)
        paymentoption = findViewById(R.id.paymentOptionButton)
        paymentoption.setOnClickListener {
            val intent = Intent(this, PaymentOption::class.java)
            startActivity(intent)
        }
        checkoutButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.orderdialog)
            dialog.setCancelable(false)
            dialog.show()
        }

    }
}