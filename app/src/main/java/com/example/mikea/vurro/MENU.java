package com.example.mikea.vurro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MENU extends AppCompatActivity {
    Button btnConectar,btnManejo,btnCajas,btnRutas,btnManual,btnUsuarios,btnInfo;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnConectar = (Button)findViewById(R.id.btnConectar);
        btnManejo = (Button)findViewById(R.id.btnManejo);
        btnCajas = (Button)findViewById(R.id.btnCajas);
        btnRutas = (Button)findViewById(R.id.btnRutas);
        btnManual= (Button)findViewById(R.id.btnManual);
        btnUsuarios = (Button)findViewById(R.id.btnUsuarios);
        btnInfo = (Button)findViewById(R.id.btnInfo);

        View.OnClickListener Conectar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Registro.class);
                startActivity(i);
            }
        };
        btnConectar.setOnClickListener(Conectar);
        View.OnClickListener Manejo = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getApplicationContext(),Manejar.class);
                startActivity(i);
            }
        };
        btnManejo.setOnClickListener(Manejo);

        View.OnClickListener Usuarios = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Registro.class);
                startActivity(i);
            }
        };
        btnUsuarios.setOnClickListener(Usuarios);
        View.OnClickListener Cajas = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Registro.class);
                startActivity(i);
            }
        };
        btnCajas.setOnClickListener(Cajas);

        View.OnClickListener Rutas = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),INICIO.class);
                startActivity(i);
            }
        };
        btnRutas.setOnClickListener(Rutas);

        View.OnClickListener Manual = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Manual.class);
                startActivity(i);
            }
        };
        btnManual.setOnClickListener(Manual);

        View.OnClickListener Info = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),INICIO.class);
                startActivity(i);
            }
        };
        btnInfo.setOnClickListener(Info);

    }

}
