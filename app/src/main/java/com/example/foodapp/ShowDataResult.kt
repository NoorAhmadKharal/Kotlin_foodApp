package com.example.foodapp

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ShowDataResult : AppCompatActivity() {


    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data_result)

        val listView = findViewById<ListView>(R.id.listView)
        val databaseHandler = DataBase(applicationContext)

    }
}