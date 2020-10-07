package com.uso.guia5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button btnDatos;
 private Button btnCalculadora;
 private Button btnLogin;
 private Button btnConversacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.btnCalculadora = findViewById(R.id.btnCalculadora);
        this.btnDatos = findViewById(R.id.btnDatos);
        this.btnLogin = findViewById(R.id.btnLogin);
        this.btnConversacion = findViewById(R.id.btnConversacion);

        this.btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Calculadora.class);
                startActivity(i);
            }
        });

        this.btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Datos.class);
                startActivity(i);

            }
        });
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        this.btnConversacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Conversacion.class);
                startActivity(i);

            }
        });




    }
}