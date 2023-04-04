package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pay2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay2)


//        var Total_bill: TextView = findViewById(R.id.totalpay)
        var Total_bill:TextView =findViewById(R.id.totalpay)

        val intent = intent
        var totalpay = intent.getIntExtra("message_key", 0)
        Total_bill.setText("Total = $totalpay")
    }
}