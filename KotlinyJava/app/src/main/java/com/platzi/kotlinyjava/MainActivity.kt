package com.platzi.kotlinyjava

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtxUser: EditText
    lateinit var edtxPass: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtxUser = findViewById(R.id.edtxLoginUsuario) as EditText
        edtxPass = findViewById(R.id.edtxLoginPassw) as EditText
        btnLogin = findViewById(R.id.btnLogin) as Button

        val sharedPreferences = getSharedPreferences("kotlinpre", Context.MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("loggeado", false)
        if (isLogged) {
            startActivity(Intent(this, ListadoActivity::class.java))
            finish()
        }

        btnLogin.setOnClickListener {
            val isValid = edtxPass.passwordValida()
            Log.e(TAG, "onClick: " + isValid)
            if (isValid) {
                //iniciarVista
//                startActivity(Intent(this@MainActivity, ListadoActivity::class.java))
                val intent = Intent(this@MainActivity, ListadoActivity::class.java)
                intent.putExtra("usuario", edtxUser.text.toString())
                startActivity(intent)
                sharedPreferences.edit {
                    putBoolean("loggeado", true)
                }
            } else {
                Toast.makeText(this@MainActivity, "Password Invalida", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {

        private val TAG = "MainActivity"
    }
}
