
package com.example.mikea.vurro;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class this_is_us extends AppCompatActivity
{   ImageButton imgbStart, imgbStop;
    ImageView imgUs;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_is_us);

        imgbStart= (ImageButton)findViewById(R.id.imgbStart);
        imgbStop= (ImageButton)findViewById(R.id.imgbStop);
        imgUs= (ImageView) findViewById(R.id.imgUs);
View.OnClickListener Start = new View.OnClickListener()
        {
@Override
public void onClick(View v)
        {
        if (v.getId()==R.id.imgbStart)
        start();
        }
        };
        imgbStart.setOnClickListener(Start);

        View.OnClickListener Stop = new View.OnClickListener()
        {
@Override
public void onClick(View v)
        {
        if (v.getId()==R.id.imgbStop)
        stop();
        }
        };
        imgbStop.setOnClickListener(Stop);

        }

public void start()
        {
        AnimationDrawable animacion = new AnimationDrawable();

        animacion.addFrame(getResources().getDrawable(R.drawable.f1),3000);

        animacion.addFrame(getResources().getDrawable(R.drawable.f5),3000);




        animacion.addFrame(getResources().getDrawable(R.drawable.f15),3000);

        animacion.addFrame(getResources().getDrawable(R.drawable.f24),3000);

        imgUs.setBackgroundDrawable(animacion);

        animacion.start();
        }

public void stop()
        {
        AnimationDrawable animacion = new AnimationDrawable();
        animacion.stop();
        }
        }


