package com.example.mikea.vurro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MENU extends AppCompatActivity {
    Button btnConectar,btnManejo,btnCajas,btnRutas,btnManual,btnUsuarios;
    ImageButton imgbinfo,imgbcerrar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnConectar = (Button)findViewById(R.id.btnConectar);
        btnManejo = (Button)findViewById(R.id.btnManejo);
        btnCajas = (Button)findViewById(R.id.btnCajas);
        btnManual= (Button)findViewById(R.id.btnManual);
        btnUsuarios = (Button)findViewById(R.id.btnUsuarios);
        imgbinfo=(ImageButton)findViewById(R.id.imgbinfo);
        imgbcerrar=(ImageButton)findViewById(R.id.imgbcerrar);

        /*
            @ Aquí se manda a los activitys correspondientes
         */

        btnConectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getApplicationContext(),Conexion.class);
                startActivity(i);
            }
        });
        btnManejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getApplicationContext(),Manejar.class);
                startActivity(i);
            }
        });
        btnCajas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getApplicationContext(),Cajas.class);
                startActivity(i);
            }
        });

        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getApplicationContext(),Manual.class);
                startActivity(i);
            }
        });

        btnUsuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Usuario.class);
                startActivity(i);
            }
        });
        imgbinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                LayoutInflater infor = getLayoutInflater();
                Toast mensaje = new Toast(getApplicationContext());
                View informacion= infor.inflate(R.layout.info,null);
                mensaje.setDuration(Toast.LENGTH_LONG);
                mensaje.setView(informacion);
                mensaje.show();
            }
        });
        imgbcerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            finish();//UwU
            }
        });

        /*
            @Aquí acaba de mandar a los activitys correspondientes
         */
       /* imgbinfo.setOnClickListener(Voca8 View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LayoutInflater infor = getLayoutInflater();
                Toast mensaje = Voca8 Toast(getApplicationContext());
                View informacion= infor.inflate(R.id.imgbInfo,null);                        , null);
                mensaje.setDuration(Toast.LENGTH_LONG);
                mensaje.setView(informacion);
            }
        });*/

    }

}
