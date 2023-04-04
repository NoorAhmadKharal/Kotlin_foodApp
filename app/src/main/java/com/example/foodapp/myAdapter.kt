package com.example.foodapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter(var mctx: Context, var resourse:Int, var item:List<Model>):
    ArrayAdapter<Model>(mctx,resourse,item) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mctx)
        val view: View = layoutInflater.inflate(resourse,null)

        val imageView : ImageView = view.findViewById(R.id.image)
        val title : TextView = view.findViewById(R.id.textview1)
        val description : TextView = view.findViewById(R.id.textview2)

        var item:Model = item[position]
        imageView.setImageDrawable(mctx.resources.getDrawable(item.Image))
        title.text = item.title
        description.text = item.description


        return view
    }
}