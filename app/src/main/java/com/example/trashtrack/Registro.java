package com.example.trashtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button tp1 , tp2, tp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tp1 = findViewById(R.id.regre2);
        tp2 = findViewById(R.id.ing2);
        tp3 = findViewById(R.id.r1);

        tp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent d1 = new Intent(Registro.this,MainActivity.class);

                startActivity(d1);
            }
        });
        tp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d2 = new Intent(Registro.this,Inicio_sesion.class);
                startActivity(d2);

            }
        });
        tp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d3 = new Intent(Registro.this,Inicio.class);
                startActivity(d3);
            }
        });


    }
}