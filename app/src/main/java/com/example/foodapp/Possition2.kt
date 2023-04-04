package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class Possition2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possition2)

        //price Button
        val GetQuantity: TextView = findViewById(R.id.rsenter)
        // payment Button
        val sendRs: TextView = findViewById(R.id.sendpos2)

        sendRs.setOnClickListener(View.OnClickListener {
            val x: Int = GetQuantity.getText().toString().toInt()
            //sum these two numbers
            val z = 300 * x

            Toast.makeText(this,"possition1 ", Toast.LENGTH_SHORT).show()
            val databaseHandler = DataBase(applicationContext)
            databaseHandler.add_Oder(
                "Item0",
                300.toString() ,
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