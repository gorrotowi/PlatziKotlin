package com.platzi.platzistore

import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

/**
 * @author Gorro.
 */
class AnkoItemCart : AnkoComponent<AdapterCart> {
    override fun createView(ui: AnkoContext<AdapterCart>): View = with(ui) {
        verticalLayout {
            lparams(width = matchParent, height = wrapContent)
            cardView {
                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    lparams(width = matchParent)

                    imageView(R.drawable.shoe_placeholder) {
                        id = R.id.imgItem
                        scaleType = ImageView.ScaleType.CENTER_CROP
                    }.lparams(width = dip(0), height = dip(100), weight = 1f)

                    linearLayout {
                        padding = dip(5)
                        orientation = LinearLayout.VERTICAL
                        textView("Titulo producto") {
                            id = R.id.txtTitleItem
                            setTextAppearance(ctx, android.R.style.TextAppearance_Material_Large)
                        }
                        textView("Descrición corta del producto") {
                            id = R.id.txtDescItem
                            setTextAppearance(ctx, android.R.style.TextAppearance_Material_Small)
                        }
                        textView("$230") {
                            id = R.id.txtPriceItem
                            setTextAppearance(ctx, android.R.style.TextAppearance_Material_Large)
                            textColor = resources.getColor(R.color.colorAccent)
                        }.lparams {
                            topMargin = dip(5)
                            gravity = Gravity.END
                        }
                    }.lparams(width = dip(0), height = wrapContent, weight = 2f)
                }
            }
        }
    }
}