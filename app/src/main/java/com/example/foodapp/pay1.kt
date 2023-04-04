package com.example.foodapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class pay1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay1)


        var Total_bill:TextView = findViewById(R.id.totalpay)

        val intent = intent
        var totalpay = intent.getIntExtra("message_key", 0)
        Total_bill.setText("Total = $totalpay")
        Toast.makeText(this,"Data insert", Toast.LENGTH_SHORT).show()
    }
}