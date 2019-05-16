package com.example.mikea.vurro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Manejar extends AppCompatActivity {
    ImageButton imgbinfo2,btniArriba,btniDerecha,btniAbajo, btniIzquierda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manejar);

        imgbinfo2=(ImageButton)findViewById(R.id.imgbinfo2);
        btniAbajo=(ImageButton)findViewById(R.id.btniAbajo);
        btniArriba=(ImageButton)findViewById(R.id.btniArriba);
        btniIzquierda=(ImageButton)findViewById(R.id.btniIzquierda);
        btniDerecha=(ImageButton)findViewById(R.id.btniDerecha);

        imgbinfo2.setOnClickListener(new View.OnClickListener()
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
