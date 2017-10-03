package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_descr.*
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.startActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val db = DBOpenHelper.getInstance(this)

        intent?.extras?.let {
            val titl = it.getString("title")
            val decr = it.getString("desc")
            val price = it.getDouble("price")
            txtDetailTitulo.text = titl
            txtDetailDesc.text = decr
            txtDetailPrice.text = "$ ${String.format("%.2f", price)}"

            btnDetailBuy.setOnClickListener {
                db?.use {
                    val namePr = "name" to titl
                    val descPr = "Desc" to decr
                    val pricePr = "price" to price
                    insert("Productos", namePr, descPr, pricePr)
                }
                startActivity<ShopCartActivity>()
            }

        }

    }
}
