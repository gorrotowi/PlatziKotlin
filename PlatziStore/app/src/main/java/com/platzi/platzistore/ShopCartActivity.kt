package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_shop_cart.*
import org.jetbrains.anko.db.select

class ShopCartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_cart)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rcCart.layoutManager = layoutManager
        rcCart.setHasFixedSize(true)

        val items = arrayListOf<ItemLanding>()

        (0..2).map { items.add(ItemLanding("Item $it", "Desc $it", it + 100.0, "")) }

        rcCart.adapter = AdapterCart(items)

    }

    override fun onResume() {
        super.onResume()
        val db = DBOpenHelper.getInstance(this)
        db?.use {
            select("Productos").exec {
                Log.e("Columnas:", "${this.columnCount}")
                Log.e("Columnas:", "${this.columnNames.size}")

                (this.columnNames).map {
                    Log.e("Columna: ", "$it")
                    Log.e("Columna: ", "${this.getColumnIndex(it)}")
                    Log.e("Columna: ", "${this.getColumnName(this.getColumnIndex(it))}")
                }

                this.moveToFirst()
                do {
                    Log.e("VALUE", this.getString(1) ?: "")
                    Log.e("VALUE", this.getString(2) ?: "")
                    Log.e("VALUE", "${this.getDouble(3)}")
                } while (this.moveToNext())

            }
        }
    }
}
