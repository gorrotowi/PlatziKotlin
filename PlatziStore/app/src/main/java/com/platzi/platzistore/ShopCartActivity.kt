package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_shop_cart.*

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
}
