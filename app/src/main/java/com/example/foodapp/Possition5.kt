package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Possition5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possition5)

        val GetQuantity: TextView = findViewById(R.id.rsenter)
        // payment Button
        val sendRs: TextView = findViewById(R.id.sendpos5)
        sendRs.setOnClickListener(View.OnClickListener {
            val x: Int = GetQuantity.getText().toString().toInt()
            //sum these two numbers
            val z = 500 * x

            Toast.makeText(this,"possition5 ", Toast.LENGTH_SHORT).show()
            val databaseHandler = DataBase(applicationContext)
            databaseHandler.add_Oder(
                "Item0",
                500.toString() ,
                x.toString() ,
                z.toString()
            )

            val intent = Intent(this,pay1::class.java)
            intent.putExtra("message_key", z)
            startActivity(intent)
            finish()

        })
    }
}