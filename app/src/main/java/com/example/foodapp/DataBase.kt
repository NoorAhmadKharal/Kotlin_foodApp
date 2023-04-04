package com.example.foodapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

@Suppress("UNREACHABLE_CODE")
class DataBase(context: Context) : SQLiteOpenHelper(context,DataBase_NAme,null,BATABASE_VERSION) {

    companion object {

        private const val BATABASE_VERSION = 1

        private const val DataBase_NAme = "Kotlin_FoodAppNew"

        private const val TABLE_Oder = "food_oder"

        private const val User_TBL = "user_table"
        private const val ID = "id"
        private const val KEY_UserName = "name"
        private const val Email = "email"
        private const val Phone = "phone"
        private const val Password = "password"

        private const val KEY_order_id = "order_id"
        private const val KEY_order_amount = "order_amount"

        private const val KEY_order_item_name = "order_details_item_name"
        private const val KEY_order_item_price = "order_details_item_price"
        private const val KEY_order_item_qty = "order_details_item_qty"

    }

    override fun onCreate(db: SQLiteDatabase?) {

        val createTable1 = ("CREATE TABLE " + User_TBL + "("
                + ID + " INTEGER PRIMARY KEY,"
                + KEY_UserName + " TEXT,"
                + Phone + " TEXT,"
                + Password + " TEXT,"
                + Email + " TEXT" + ")"
                )

        val createTable2 = ("CREATE TABLE " + TABLE_Oder + "("
                + KEY_order_id + " INTEGER PRIMARY KEY,"
                + KEY_order_amount + " TEXT,"
                + KEY_order_item_name + " TEXT,"
                + KEY_order_item_price + " TEXT,"
                + KEY_order_item_qty + " TEXT" + ")"
                )
        db?.execSQL(createTable2)
        db?.execSQL(createTable1)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db!!.execSQL("DROP TABLE IF EXISTS " + com.example.foodapp.DataBase.User_TBL)
        db!!.execSQL("DROP TABLE IF EXISTS " + com.example.foodapp.DataBase.TABLE_Oder)
        onCreate(db)
    }

    fun add_Oder(itemName: String, itemPrice: String, itemQty: String, totalPrice: String): Long {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(KEY_order_item_name, itemName)
        values.put(KEY_order_amount, totalPrice)
        values.put(KEY_order_item_price, itemPrice)
        values.put(KEY_order_item_qty, itemQty)

        return db.insert(TABLE_Oder, null, values)
    }
    fun user(username: String, phone: String, password: String, email: String): Long {

        val db = this.writableDatabase
        val values2 = ContentValues()

        values2.put(KEY_UserName, username)
        values2.put(Phone, phone)
        values2.put(Password, password)
        values2.put(Email, email)
        return db.insert(User_TBL, null, values2)


        fun doLogin(username: String, password: String): Boolean {
            val db = this.writableDatabase
            val Query =
                ("Select * from " + com.example.foodapp.DataBase.User_TBL + " where "
                        + com.example.foodapp.DataBase.KEY_UserName + " = " + "'" + username + "' "
                        + com.example.foodapp.DataBase.Password + " = " + "'" + password + "' ")
            val cursor = db.rawQuery(Query, null)
            if (cursor.count <= 0) {
                cursor.close()
                return false
            }
            cursor.close()
            return true
        }

    }



}

