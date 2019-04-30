package com.example.mikea.vurro;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import OpenHelper.SQLite_OpenHelper;

public class INICIO extends AppCompatActivity {
TextView txtRegistrate;
Button btnInSesion;

SQLite_OpenHelper helper=new SQLite_OpenHelper(this, "BD1",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        txtRegistrate=(TextView)findViewById(R.id.txtRegistrate);
        btnInSesion=(Button)findViewById(R.id.btnInSesion);

        txtRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Registro.class);
                startActivity(i);
            }
        });
        btnInSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txteUsuario = (EditText) findViewById(R.id.txteUsuario);
                EditText txteContraseña = (EditText) findViewById(R.id.txteContraseña);
                /*try {
                    Cursor cursor = helper.ConsultarUsuPas(txteUsuario.getText().toString(), txteContraseña.getText().toString());
                    if(cursor.getCount()>0){
                        Intent i= new Intent(getApplicationContext(),MENU.class);
                        startActivity(i);
                    }else {
                        Toast toast1 =
                        toast1.show();
                    }
txteContraseña.setText("");
                    txteUsuario.setText("");
                    txteUsuario.findFocus();
                } catch (SQLException e) {
                    e.printStackTrace();
                }*/

                ArrayList<String> datos = helper.getUserPrefs(txteUsuario.getText().toString(), txteContraseña.getText().toString());
                if (datos.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Usuario y/o Contraseña incorrectos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(INICIO.this, "Usuario encontrado", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MENU.class);
                    startActivity(i);
                }

            }

        });

    }
}
