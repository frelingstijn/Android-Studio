package com.example.piza_scam_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val login = findViewById<Button>(R.id.buttonlogin)
        login.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)

            val emailLogin = findViewById<EditText>(R.id.editTextTextEmailAddress)

            val passwordLogin = findViewById<EditText>(R.id.editTextTextPassword)

            val data = getSharedPreferences(emailLogin.toString(), MODE_PRIVATE)

           val Password = data.getString("password", passwordLogin.toString())

            if (passwordLogin.text.toString().isNotBlank()){
                if (Password == passwordLogin.text.toString()){
                    startActivity(intent)
                }
            }


        }
        val forgotPassword = findViewById<Button>(R.id.forgotPassword)
        forgotPassword.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val createAccount = findViewById<Button>(R.id.createaccount)
        createAccount.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }



    }
}