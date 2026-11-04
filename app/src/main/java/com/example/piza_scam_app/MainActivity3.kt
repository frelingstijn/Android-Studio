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
        val email = findViewById<EditText>(R.id.createemail)
//
        val password = findViewById<EditText>(R.id.createpassword)
//
        val homeAddress = findViewById<EditText>(R.id.homeaddress)
//
        val firstName= findViewById<EditText>(R.id.firstname)
//
        val lastName = findViewById<EditText>(R.id.lastname)
//
        val age = findViewById<EditText>(R.id.age)
//
        val creditCardNumber = findViewById<EditText>(R.id.creditcardnumber)
//
        val creditCardControlNumber = findViewById<EditText>(R.id.creditcardcontrolnumber)
//
        val phoneNumber = findViewById<EditText>(R.id.phonenumber)

        val informatie = email.text.toString()

        val data = getSharedPreferences(informatie, MODE_PRIVATE)
//
        val confirm = findViewById<Button>(R.id.confirm)

        confirm.setOnClickListener {



            if (email.text.toString().isBlank()){
                Toast.makeText(this, "vul een email in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("email", email.toString()).apply()
            }

            if (password.text.toString().isBlank()){
                Toast.makeText(this, "vul een wachtwoord in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("password", password.toString()).apply()
            }

            if (homeAddress.text.toString().isBlank()){
                Toast.makeText(this, "vul een huis adres in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("homeAddress", homeAddress.toString()).apply()
            }

            if (firstName.text.toString().isBlank()){
                Toast.makeText(this, "vul een voornaam in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("firstName", firstName.toString()).apply()
            }

            if (lastName.text.toString().isBlank()){
                Toast.makeText(this, "vul een achter naam in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("lastName", lastName.toString()).apply()
            }

            if (age.text.toString().isBlank()){
                Toast.makeText(this, "vul een leeftijd in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("age", age.toString()).apply()
            }

            if (creditCardNumber.text.toString().isBlank()){
                Toast.makeText(this, "vul een credit card numer in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("creditCardNumber", creditCardNumber.toString()).apply()
            }

            if (creditCardControlNumber.text.toString().isBlank()){
                Toast.makeText(this, "vul een creditCardControlNumber in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("creditCardControlNumber", creditCardControlNumber.toString()).apply()
            }

            if (phoneNumber.text.toString().isBlank()){
                Toast.makeText(this, "vul een telefoon nummer in.", Toast.LENGTH_SHORT).show()
            } else {
                data.edit().putString("phoneNumber", phoneNumber.toString()).apply()
            }

            val intent = Intent(this, MainActivity4::class.java)


            startActivity(intent)
        }
    }
}