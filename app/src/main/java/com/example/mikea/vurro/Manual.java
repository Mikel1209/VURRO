package com.example.mikea.vurro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Manual extends AppCompatActivity {
    Spinner spnOpciones;
    ImageView imgOp;
    ImageButton imgbInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        spnOpciones=(Spinner)findViewById(R.id.spnOpciones);
        imgOp=(ImageView)findViewById(R.id.imgOp);

        imgbInformacion=(ImageButton)findViewById(R.id.imgbInformacion);
        imgbInformacion.setOnClickListener(new View.OnClickListener()
        {
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



        ArrayAdapter Opciones = ArrayAdapter.createFromResource(this, R.array.Opciones,
                R.layout.spinner_styles);
        spnOpciones.setAdapter(Opciones);
        spnOpciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> spinner, View view, int position, long id)
            {

                if ( spinner.getItemAtPosition(position).equals("Manejo"))
                {
                    imgOp.setImageResource(R.drawable.logout);
                }
                if ( spinner.getItemAtPosition(position).equals("Usuarios"))
                {
                    imgOp.setImageResource(R.drawable.logo);
                }
                if (spinner.getItemAtPosition(position).equals("Abrir/Cerrar cajas"))
                {
                    imgOp.setImageResource(R.drawable.fondo);
                }
                if (spinner.getItemAtPosition(position).equals("Opciones"))
                {
                    imgOp.setImageResource(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> spinner) {


            }
        });




    }
}
