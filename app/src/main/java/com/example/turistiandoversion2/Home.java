package com.example.turistiandoversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botoHoteles;
    Button botonResteurantes;
    Button botonTurismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       botoHoteles=findViewById(R.id.botonhoteles);
       botonResteurantes=findViewById(R.id.botonrestaurantes);
       botonTurismo=findViewById(R.id.botonsitios);

       //Detectar eventos
        botoHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hice click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}