package com.example.myapplication

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

class LogIn : AppCompatActivity() {

    lateinit var toolbar : Toolbar
    lateinit var logInButtonInLogin : Button
    lateinit var forgetPasswordTextButton : TextView
    lateinit var signUpTextButton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        logInButtonInLogin= findViewById(R.id.logInButtonInLogin)
        signUpTextButton = findViewById(R.id.signUptext)
        toolbar = findViewById(R.id.toolbarLogin)
        forgetPasswordTextButton = findViewById(R.id.forgetPassword)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Log In"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        forgetPasswordTextButton.setOnClickListener{
            val forgetPasswordIntent = Intent(applicationContext,ChangePassword::class.java)
            startActivity(forgetPasswordIntent)
        }

        signUpTextButton.setOnClickListener{
            val signUpIntent = Intent(applicationContext,GoogleMapsActivity::class.java)
            startActivity(signUpIntent)
        }

        logInButtonInLogin.setOnClickListener{
            val dashboardIntent = Intent(applicationContext,DashBoard::class.java)
            startActivity(dashboardIntent)
        }



    }
}