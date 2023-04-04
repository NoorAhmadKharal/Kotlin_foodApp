package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Before_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_before)


        val loginButton:Button=findViewById(R.id.login)
        val regis:Button = findViewById(R.id.register)
        val skip :Button = findViewById(R.id.skip)
        val showRecord : Button = findViewById(R.id.showResults)

        loginButton.setOnClickListener {

            Toast.makeText(this,"login Button click ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }

        regis.setOnClickListener {

            Toast.makeText(this,"Register Button click ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,register::class.java)
            startActivity(intent)

        }
        skip.setOnClickListener {

            Toast.makeText(this,"skip Button click ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        showRecord.setOnClickListener {

            Toast.makeText(this,"showdata Button click ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ShowDataResult::class.java)
            startActivity(intent)
        }

    }










}