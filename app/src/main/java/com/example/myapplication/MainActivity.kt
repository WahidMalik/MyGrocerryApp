package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var signupButton : Button
    lateinit var loginButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signupButton = findViewById(R.id.signUpButton)
        loginButton = findViewById(R.id.LogInButton)

            loginButton.setOnClickListener {
                val logInIntent = Intent(applicationContext,LogIn::class.java)
                startActivity(logInIntent)
            }

            signupButton.setOnClickListener {
                val signUpIntent = Intent(applicationContext,Categories::class.java)
                startActivity(signUpIntent)
            }






    }
}
