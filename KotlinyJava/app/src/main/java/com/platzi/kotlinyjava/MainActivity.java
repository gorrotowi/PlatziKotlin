package com.platzi.kotlinyjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    EditText edtxUser;
    EditText edtxPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxUser = (EditText) findViewById(R.id.edtxLoginUsuario);
        edtxPass = (EditText) findViewById(R.id.edtxLoginPassw);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        PojoBasico pojoLista = new PojoBasico("Titulo 1", "Descripcion 1");
        PojoBasico pojoLista2 = new PojoBasico("Titulo 1");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isValid = ValidacionesKt.passwordValida(edtxPass);
                Log.e(TAG, "onClick: " + isValid);
                if (isValid) {
                    //iniciarVista
                } else {
                    Toast.makeText(MainActivity.this, "Password Invalida", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
