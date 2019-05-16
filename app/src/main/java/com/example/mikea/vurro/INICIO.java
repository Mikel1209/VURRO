package com.example.mikea.vurro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import OpenHelper.SQLite_OpenHelper;

public class INICIO extends AppCompatActivity {
TextView txtRegistrate;
Button btnInSesion;
EditText txteUsuario,txteContraseña;
CheckBox chkCredenciales;

SQLite_OpenHelper helper=new SQLite_OpenHelper(this, "BD1",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        txtRegistrate=(TextView)findViewById(R.id.txtRegistrate);
        btnInSesion=(Button)findViewById(R.id.btnInSesion);
        txteUsuario = (EditText) findViewById(R.id.txteUsuario);
        txteContraseña = (EditText) findViewById(R.id.txteContraseña);
        chkCredenciales=(CheckBox)findViewById(R.id.chkCredenciales);



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

        if (chkCredenciales.isSelected())
        {

            guardar();
        }
        else
        {
            cargar();

        }




    }

    private void cargar ()
    {
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String user=preferences.getString("user","");
        String pass=preferences.getString("pass","");
        txteUsuario.setText(user);
        txteContraseña.setText(pass);
    }

    private void guardar()
    {
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String Usuario=txteUsuario.getText().toString();
        String Contraseña=txteContraseña.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user",Usuario);
        editor.putString("pass",Contraseña);
        txteUsuario.setText(Usuario);
        txteContraseña.setText(Contraseña);
        editor.commit();
    }
}
