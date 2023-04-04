package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listview = findViewById<ListView>(R.id.listview)

        var list = mutableListOf<Model>()
        listview.adapter = myAdapter(this,R.layout.row,list)
        list.add(Model("chicken_skewers","",R.drawable.chicken_skewers))
        list.add(Model("fresh_orange_juice_glass","",R.drawable.fresh_orange_juice_glass ))
        list.add(Model("fried_fish_carp_fresh_vegetable","",R.drawable.fried_fish_carp_fresh_vegetable))
        list.add(Model("grilled_chicken_legs_flaming_grill_with_grilled_vegetables","",R.drawable.grilled_chicken_legs_flaming_grill_with_grilled_vegetables))
        list.add(Model("grilled_chicken_wings_flaming_grill_with_grilled","",R.drawable.grilled_chicken_wings_flaming_grill_with_grilled))
        list.add(Model("grilled_chicken_legs","food",R.drawable.grilled_chicken_legs))
        list.add(Model("fried_rice_with_minced_pork","",R.drawable.fried_rice_with_minced_pork))
        list.add(Model("mutton_biryani_food","",R.drawable.mutton_biryani_food))
        list.add(Model("plate_fried_fish","",R.drawable.plate_fried_fish))
        list.add(Model("burgher","",R.drawable.burgher))


        listview.setOnItemClickListener { adapterView:AdapterView<*>, view:View, i:Int, l ->Long

            if(i==0){

                Toast.makeText(this,"chicken_skewers",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,possition1::class.java)
                startActivity(intent)
            }
            if(i==1){

                Toast.makeText(this,"fresh_orange_juice_glass",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition2::class.java)
                startActivity(intent)
            }
            if(i==2){

                Toast.makeText(this,"fried_fish_carp_fresh_vegetable",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition3::class.java)
                startActivity(intent)
            }
            if(i==3){

                Toast.makeText(this,"grilled_chicken_legs_flaming_grill_with_grilled_vegetables",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition4::class.java)
                startActivity(intent)
            }
            if(i==4){

                Toast.makeText(this,"grilled_chicken_wings_flaming_grill_with_grilled",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition5::class.java)
                startActivity(intent)
            }
            if(i==5){

                Toast.makeText(this,"grilled_chicken_legs",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition6::class.java)
                startActivity(intent)
            }
            if(i==6){

                Toast.makeText(this,"fried_rice_with_minced_pork",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition7::class.java)
                startActivity(intent)
            }
            if(i==7){

                Toast.makeText(this,"mutton_biryani_food",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition8::class.java)
                startActivity(intent)
            }
            if(i==8){

                Toast.makeText(this,"plate_fried_fish",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition9::class.java)
                startActivity(intent)
            }
            if(i==9){

                Toast.makeText(this,"burgher",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Possition10::class.java)
                startActivity(intent)
            }

        }




    }
}