
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
       animacion.addFrame(getResources().getDrawable(R.drawable.f2),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f3),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f4),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f5),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f6),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f7),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f8),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f9),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f10),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f11),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f12),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f13),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f14),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f15),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f16),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f17),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f18),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f19),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f20),3000);
       animacion.addFrame(getResources().getDrawable(R.drawable.f21),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f22),3000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f23),3000);
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


