package com.example.foodapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val username:EditText = findViewById(R.id.Userername)
        val userphone:EditText = findViewById(R.id.UserPhone)
        val useremail:EditText= findViewById(R.id.Useremailaddress)
        val userpassword:EditText = findViewById(R.id.Userpassword)
        val register = findViewById<View>(R.id.register)

        register.setOnClickListener {

            val nameTEXT:String = username.text.toString()
            val phoneTEXT :String= userphone.text.toString()
            val emailTEXT :String= useremail.text.toString()
            val passwordTEXT:String = userpassword.text.toString()


            Toast.makeText(this,"before regis Button click ", Toast.LENGTH_SHORT).show()

            val databaseHandler = DataBase(applicationContext)
            databaseHandler.user(
                nameTEXT, phoneTEXT, passwordTEXT, emailTEXT,
            )
            Toast.makeText(this,"after regis Button click ", Toast.LENGTH_SHORT).show()
        }
    }
}