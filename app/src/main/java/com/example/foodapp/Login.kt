package com.example.foodapp

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val values = ContentValues()


        val SignIn : TextView = findViewById(R.id.signin)

        val loginName:EditText=findViewById(R.id.editTextPhone2)
        val LoginPass:EditText=findViewById(R.id.editTextTextPassword3)

        SignIn.setOnClickListener {



            Toast.makeText(this,"login Button click ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }




    }
}