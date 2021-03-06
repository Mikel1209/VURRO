package com.example.mikea.vurro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MENU extends AppCompatActivity {
    Button btnConectar,btnManejo,btnCajas,btnManual,btnUsuarios;
    ImageButton imgbinfo,imgbcerrar,imgbVURRO;
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
        imgbVURRO=(ImageButton)findViewById(R.id.imgbVURRO);


        /**
         *         Bundle bundle = getIntent().getExtras();
         *         String user= bundle.getString("Usuario");
         *         txtUsuario.setText(user);
         */
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

                //List<Usuario> usuarioLista = Usuario.find(Usuario.class)


            }
        });
        imgbVURRO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),this_is_us.class);
                startActivity(i);

            }
        });


        imgbcerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("user",null);
                editor.putString("pass",null);

                editor.commit();
                finish();
            }
        });

        /*
            @Aquí acaba de mandar a los activitys correspondientes
         */
        imgbinfo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                LayoutInflater infor = getLayoutInflater();
                Toast mensaje = new Toast(getApplicationContext());
                View informacion= infor.inflate(R.layout.informacion,null);
                mensaje.setDuration(Toast.LENGTH_LONG);
                mensaje.setView(informacion);
                mensaje.show();
            }
        });

    }


}
