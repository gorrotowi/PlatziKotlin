package com.platzi.platzistore

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * @author Gorro.
 */

class AdapterCart(val data: List<ItemLanding>) : RecyclerView.Adapter<AdapterCart.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(AnkoItemCart().createView(AnkoContext.Companion.create(parent!!.context, this, false)))
    //Holder(LayoutInflater.from(parent?.context).inflate(R.layout.item_cart, parent, false))


    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindView(data = data[position])
    }

    override fun getItemCount(): Int = data.size

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgV: ImageView by lazy {
            itemView.find<ImageView>(R.id.imgItem)
        }
        val txttitle: TextView by lazy {
            itemView.find<TextView>(R.id.txtTitleItem)
        }

        val txtdesc by lazy {
            itemView.find<TextView>(R.id.txtDescItem)
        }

        val txtprice by lazy {
            itemView.find<TextView>(R.id.txtPriceItem)
        }

        fun bindView(data: ItemLanding) {
            with(data) {
                txttitle.text = title
                txtdesc.text = desc
                txtprice.text = "$ ${kotlin.String.format("%.2f", price)}"
            }

        }
    }
}