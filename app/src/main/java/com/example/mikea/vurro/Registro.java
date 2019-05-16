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
    EditText txtUsuario, txtContraseña,txtContraseña2;

    SQLite_OpenHelper helper = new SQLite_OpenHelper(this, "BD1", null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegis = (Button) findViewById(R.id.btnRegis);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);
        txtContraseña2=(EditText)findViewById(R.id.txtContraseña2);




        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

        if (txtUsuario.getText().toString().equals("") || txtContraseña.getText().toString().equals("") )
        {


                    txtUsuario.setError("Campo Vacio");
                    txtContraseña.setError("Campo Vacio");
                    txtUsuario.setText("");
                    txtContraseña.setText("");
            Toast toast1 = Toast.makeText(getApplicationContext(), "Registro Invalido", Toast.LENGTH_SHORT);
            toast1.show();
                   /* Intent o = Voca8 Intent(getApplicationContext(), Registro.class);
                    startActivity(o);*/




        }
         else
            {
                if(txtContraseña.getText().toString( ).equals( txtContraseña2.getText().toString()) )
                {
                    helper.abrir();
                    helper.insertarRG(txtUsuario.getText().toString(),
                            txtContraseña.getText().toString());
                    helper.cerrar();
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Registro correctamente subido", Toast.LENGTH_SHORT);
                    toast1.show();

                    Intent i = new Intent(getApplicationContext(), INICIO.class);
                    startActivity(i);

                }

                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Error de Autenticación", Toast.LENGTH_SHORT);
                    toast.show();

                }





            }
            }
        });

    }
}

