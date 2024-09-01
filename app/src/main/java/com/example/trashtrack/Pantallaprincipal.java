package com.example.trashtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantallaprincipal extends AppCompatActivity {

    Button b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);

        b3 = findViewById(R.id.bto3);
        b4 = findViewById(R.id.bto4);
        b5 = findViewById(R.id.bto5);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c1 = new Intent(Pantallaprincipal.this,Categorias.class);

                startActivity(c1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c2 = new Intent(Pantallaprincipal.this,estadisticas.class);

                startActivity(c2);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });


    }
}