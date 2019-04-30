package com.example.mikea.vurro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;

public class Registro extends AppCompatActivity {
    Button btnRegis;
    EditText txtUsuario,txtContraseña;

    SQLite_OpenHelper helper=new SQLite_OpenHelper(this,"BD1",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegis=(Button)findViewById(R.id.btnRegis);
        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtContraseña=(EditText)findViewById(R.id.txtContraseña);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                helper.abrir();
                helper.insertarRG(txtUsuario.getText().toString(),
                        txtContraseña.getText().toString());
                helper.cerrar();
                Toast toast1 =Toast.makeText(getApplicationContext(),"Registro correctamente subido",Toast.LENGTH_SHORT);
                toast1.show();

                Intent i= new Intent(getApplicationContext(),INICIO.class);
                startActivity(i);

            }
        });


    }

}
