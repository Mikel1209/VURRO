package com.example.mikea.vurro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import OpenHelper.SQLite_OpenHelper;

public class Usuario extends AppCompatActivity {
    ImageButton imgbInfo;
    ArrayList<String> lista = new ArrayList<>();
    ListView lstLista;
    ArrayAdapter adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        lstLista= findViewById(R.id.lstLista);
        SQLite_OpenHelper db = new SQLite_OpenHelper(Usuario.this, "BD1", null,1 );
        lista=db.llenar_lista();
        adaptador = new ArrayAdapter<>(Usuario.this, android.R.layout.simple_list_item_1, lista);
        lstLista.setAdapter(adaptador);

        imgbInfo=(ImageButton)findViewById(R.id.imgbinfo);
        imgbInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
