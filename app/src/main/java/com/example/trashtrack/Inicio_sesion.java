package com.example.trashtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio_sesion extends AppCompatActivity {

    Button bt3, bt4, bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        bt3 = findViewById(R.id.regre);
        bt4 = findViewById(R.id.btona);


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c1 = new Intent(Inicio_sesion.this,MainActivity.class);

                startActivity(c1);

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c2 = new Intent(Inicio_sesion.this,Registro.class);

                startActivity(c2);
            }
        });






    }
}