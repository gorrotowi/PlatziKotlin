package com.platzi.kotlinyjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        RecyclerView rcListado = (RecyclerView) findViewById(R.id.rcListado);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rcListado.setLayoutManager(linearLayoutManager);

        rcListado.setAdapter(new AdapterListado(getFakeData()));

    }

    private List<PojoBasico> getFakeData() {
        List<PojoBasico> pojoBasicos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pojoBasicos.add(new PojoBasico("Titulo", "Desc"));
        }
        return pojoBasicos;
    }

}
