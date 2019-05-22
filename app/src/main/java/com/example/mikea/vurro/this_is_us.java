
package com.example.mikea.vurro;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;


public class this_is_us extends AppCompatActivity
{   ImageButton imgbStart, imgbStop;
    ImageView imgUss;
    AnimationDrawable animacion = new AnimationDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_is_us);
        imgbStart= (ImageButton)findViewById(R.id.imgbStart);
        imgbStop= (ImageButton)findViewById(R.id.imgbStop);
        imgUss= (ImageView) findViewById(R.id.imgUss);

        imgbStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio();
            }
        });

        imgbStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio();
            }
        });
        imgbStop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });

        }

public void inicio ()
        {
        animacion.addFrame(getResources().getDrawable(R.drawable.f24),1000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f1),1000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f5),1000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f7),1000);
        animacion.addFrame(getResources().getDrawable(R.drawable.f15),1000);
        animacion.setOneShot(false);
        imgUss.setImageDrawable(animacion);
        animacion.start();
        }

public void stop()
        {

        animacion.stop();
        }
        }


