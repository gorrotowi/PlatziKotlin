package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView.text = "Hola desde Kotlin"


//        Toast.makeText(this, "Mensaje desde un Toast", Toast.LENGTH_LONG).show()
//        toastShort("Toast corto")
//        toastLong("Mensaje en toast largo")
        toast("Mensaje toast largo", Toast.LENGTH_LONG)

    }
}
