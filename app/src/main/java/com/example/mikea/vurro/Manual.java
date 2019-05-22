package com.example.mikea.vurro;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Manual extends AppCompatActivity {
    Spinner spnOpciones;
    ImageView imgOp;
    TextView txtInformacion;
    ImageButton imgbInformacion;
    AnimationDrawable animacion = new AnimationDrawable();
    AnimationDrawable ani = new AnimationDrawable();
    AnimationDrawable a = new AnimationDrawable();
    AnimationDrawable an = new AnimationDrawable();
    AnimationDrawable anim = new AnimationDrawable();
    AnimationDrawable anima = new AnimationDrawable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        spnOpciones=(Spinner)findViewById(R.id.spnOpciones);
        imgOp=(ImageView)findViewById(R.id.imgOp);
        txtInformacion=(TextView)findViewById(R.id.txtInformacion);

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
        /**
         *         <item>Opciones</item>
         *         <item>Manejo</item>
         *         <item>Usuarios</item>
         *         <item>Abrir/Cerrar cajas</item>
         *         <item>Registro</item>
         *         <item>Conexión</item>
         */
        spnOpciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> spinner, View view, int position, long id)
            {

                if ( spinner.getItemAtPosition(position).equals("Manejo"))
                {
                    ani.stop();
                    an.stop();
                    a.stop();
                    Manejo();
                    txtInformacion.setText("Despúes de abrir la aplicación damos click en el botón \"Manejar\" donde nos aparecera la página correspondiente.En esta " +
                            "habra 4 flechas en distintas direcciones, estas son para manejar el carrito, igualmente hay un botón de \"Desocnectar\" nuestro dispositivo" +
                            " .Además de que se va a mostrar en pantalla el dato que estamos dando, por ultimo hay un boton de informcación, para dudas ");

                }
                if ( spinner.getItemAtPosition(position).equals("Conexión"))
                {
                    animacion.stop();
                    an.stop();
                    a.stop();
                    //Conexion();
                    txtInformacion.setText("Despúes de abrir la aplicación damos click en el botón \"Conexión\" donde nos aparecera la página correspondiente.En esta " +
                "aquí es donde se va conectar nuestro dispositivo movil con el carrito, para esto nos pide encender nuestro Bluetooth ");
                }
                if ( spinner.getItemAtPosition(position).equals("Usuarios"))
                {
                    ani.stop();
                    an.stop();
                    animacion.stop();
                    Registro();
                    txtInformacion.setText("Al dal click en el botón \"Usuarios\" se mostrara un alista con todos los usuarios registrados");

                }
                if ( spinner.getItemAtPosition(position).equals("Registro"))
                {
                    ani.stop();
                    animacion.stop();
                    a.stop();
                    Registrar();
                    txtInformacion.setText("Al abrir la aplicacion nos manda a la página principal, en esta podemos entrar con nuetsro usuario o registrarnos " +
                            "si no contramos ya con un usuario, para registrarnos ponemos un nombre de usuario, creamos una contraseña y la autentiicamos, " +
                            "posteriormente ingresamos la clave del profesor (esta se nos proporciona por el profesor encargado de la aplicación), después de este " +
                            "proceso podemos entrar a la aplicación");

                }

                if (spinner.getItemAtPosition(position).equals("Abrir/Cerrar cajas"))
                {
                    txtInformacion.setText("Después de dar click en el botón de \"Cerrar/Abrir cajas\" se abrira la página correspondiente, esta página cuenta con  2 botones los cuales nos sirven para abrir o cerrar la cerradura" +
                            "cuenta con un boton para desconectar nuetsro dispositivo, en la parte central se mostrara el dato que se esta dando (Abrir/Cerrar)");
                }
                if (spinner.getItemAtPosition(position).equals("Opciones"))
                { txtInformacion.setText(null);
                    ani.stop();
                    an.stop();
                    a.stop();
                    animacion.stop();
                    txtInformacion.setText("Todas las páginas cunetan con un icono de información donde se encuentran los números del soporte tecnico para cualquier duda o aclaracion ");
                    Opcion();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> spinner) {


            }
        });




    }

    public void Manejo ()

    {       animacion.addFrame(getResources().getDrawable(R.drawable.menu),3000);
            animacion.addFrame(getResources().getDrawable(R.drawable.manejo),3000);
            imgOp.setBackgroundDrawable(animacion);
            animacion.setOneShot(false);
            animacion.start();
    }
    public void Conexion ()
    {   ani.addFrame(getResources().getDrawable(R.drawable.blanco),3000);
        ani.addFrame(getResources().getDrawable(R.drawable.negro),3000);
        imgOp.setBackgroundDrawable(ani);
        ani.setOneShot(false);
        ani.start();
    }
    public void Registro ()
    {   a.addFrame(getResources().getDrawable(R.drawable.usuarios),3000);
        imgOp.setBackgroundDrawable(a);
        a.setOneShot(false);
        a.start();
    }
    public void Registrar ()
    {   an.addFrame(getResources().getDrawable(R.drawable.registro),3000);
        an.addFrame(getResources().getDrawable(R.drawable.resgistro_usuarios),3000);
        an.addFrame(getResources().getDrawable(R.drawable.inicio),3000);
        an.addFrame(getResources().getDrawable(R.drawable.menu),3000);
        imgOp.setBackgroundDrawable(an);
        an.setOneShot(false);
        an.start();
    }
    public void Cajas ()
    {   anim.addFrame(getResources().getDrawable(R.drawable.cajas),3000);
        imgOp.setBackgroundDrawable(anim);
        anim.setOneShot(false);
        anim.start();
    }
    public void Opcion ()
    {   anima.addFrame(getResources().getDrawable(R.drawable.info),3000);
        imgOp.setBackgroundDrawable(anima);
        anima.setOneShot(false);
        anima.start();
    }


}
