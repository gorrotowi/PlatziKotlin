package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView.text = "Hola desde Kotlin"


//        Toast.makeText(this, "Mensaje desde un Toast", Toast.LENGTH_LONG).show()
//        toastShort("Toast corto")
//        toastLong("Mensaje en toast largo")
//        toast("Mensaje toast largo", Toast.LENGTH_LONG)

//        toast("Mensaje desde Anko")
        longToast("Otro mensaje desde Anko")

//        startActivity(Intent(this, DetailActivity::class.java))

        startActivity<DetailActivity>()
    }
}
