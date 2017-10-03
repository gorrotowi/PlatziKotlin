package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcViewLanding.layoutManager = GridLayoutManager(this, 2)

        val retrofit = Retrofit.Builder()
                .baseUrl("http://10.0.3.2:5000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val endpoint = retrofit.create(Endpoints::class.java)

        val call = endpoint.getList()

        call.enqueue(object : Callback<JSONObject> {

            override fun onResponse(call: Call<JSONObject>?, response: Response<JSONObject>?) {
                if (response?.code() == 200) {
                    Log.e("Respuesta", "${response.body().toString()}")
                }
            }

            override fun onFailure(call: Call<JSONObject>?, t: Throwable?) {

            }

        })

    }
}
