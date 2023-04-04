package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class possition1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possition1)

//    price Button
        val GetQuantity:TextView = findViewById(R.id.Editpos1)
        // payment Button
        val sendRs:TextView= findViewById(R.id.sendpos1)
        sendRs.setOnClickListener(View.OnClickListener {
            val x: Int = GetQuantity.getText().toString().toInt()

            //sum these two numbers
            val z = 200 * x

            Toast.makeText(this,"possition1 ", Toast.LENGTH_SHORT).show()

            val databaseHandler = DataBase(applicationContext)
            databaseHandler.add_Oder(
                "Item0",
                200.toString() ,
                x.toString() ,
                z.toString()
            )
            Toast.makeText(this,"data insert ", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,pay1::class.java)
            intent.putExtra("message_key", z)
            startActivity(intent)
            finish()

        })




         }
    }
