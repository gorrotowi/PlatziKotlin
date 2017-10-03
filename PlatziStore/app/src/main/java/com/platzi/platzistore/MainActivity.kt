package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import com.platzi.platzistore.pojosretrofit.PayloadItem
import com.platzi.platzistore.pojosretrofit.ResponseProducts
import kotlinx.android.synthetic.main.activity_main.*
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

        call.enqueue(object : Callback<ResponseProducts> {

            override fun onResponse(call: Call<ResponseProducts>?, response: Response<ResponseProducts>?) {
                if (response?.code() == 200) {
                    Log.e("Respuesta", "${response.body().toString()}")
                    llenarRecycler(response.body()?.payload)
                }
            }

            override fun onFailure(call: Call<ResponseProducts>?, t: Throwable?) {

            }

        })

    }

    private fun llenarRecycler(payload: List<PayloadItem?>?) {
        val productos = payload?.map {
            it?.let { (imgUrl, _, price, name, _, desc) ->
                ItemLanding(name ?: "", desc ?: "", price ?: 0.00, imgUrl ?: "")
            }
        }?.filter {
            val pr = it?.price ?: 0.00
            pr > 205.00
        }

        rcViewLanding.adapter = AdapterLanding(productos)
    }
}
