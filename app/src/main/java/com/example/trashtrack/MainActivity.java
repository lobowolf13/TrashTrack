package com.example.trashtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.insesion);
        bt2 = findViewById(R.id.Regis);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b1 = new Intent(MainActivity.this,Inicio_sesion.class);

                startActivity(b1);

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b2 = new Intent(MainActivity.this,Registro.class);

                startActivity(b2);
            }
        });
    }
}