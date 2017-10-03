package com.platzi.platzistore

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_landing.view.*
import org.jetbrains.anko.startActivity

/**
 * @author Gorro.
 */
class AdapterLanding(val data: List<ItemLanding?>?) : RecyclerView.Adapter<AdapterLanding.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(parent?.inflate(R.layout.item_landing))

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        data?.let {
            holder?.bindView(it[position])
        }
    }

    override fun getItemCount(): Int = data?.size ?: 0

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindView(itemLanding: ItemLanding?) {
            itemLanding?.let {
                with(it) {
                    itemView.txtTitleItem.text = title
                    itemView.txtDescItem.text = desc
                    itemView.txtPriceItem.text = "$ ${String.format("%.2f", price)}"
                    itemView.context.startActivity<DetailActivity>("title" to title, "desc" to desc, "price" to price)
                }
            }
        }
    }

}