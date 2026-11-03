package com.example.piza_scam_app

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email

import android.widget.Toast
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val email = findViewById<EditText>(R.id.createEmail)

        val password = findViewById<EditText>(R.id.createPassword)

        val homeAddress = findViewById<EditText>(R.id.HomeAddress)

        val firstName= findViewById<EditText>(R.id.firstName)

        val lastName = findViewById<EditText>(R.id.lastName)

        val age = findViewById<EditText>(R.id.age)

        val creditCardNumber = findViewById<EditText>(R.id.creditCardNumber)

        val creditCardControlNumber = findViewById<EditText>(R.id.creditCardControlNumber)

        val phoneNumber = findViewById<EditText>(R.id.phoneNumber)

        val data = getSharedPreferences(email, MODE_PRIVATE)

        val confirm = findViewById<Button>(R.id.confirm)

        confirm.setOnClickListener {
            if (email.isBlank()){
                Toast.makeText(this, "vul een email in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("email", email).apply()
            }

            if (password.isBlank()){
                Toast.makeText(this, "vul een wachtwoord in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("password", password).apply()
            }
            val intent = Intent(this, MainActivity4::class.java)

            startActivity(intent)
        }
    }
}