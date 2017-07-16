package com.example.carlosrestrepo.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity{

    private int duracion= 100000;
    private Intent myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView logo =(ImageView) findViewById(R.id.logoU);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3500);
                    sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent myintent = new Intent(Splash.this, MainActivity.class);
                    startActivity(myintent);
                    finish();
                }
            }
        };

        timer.start();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    protected  void onPause() {
        super.onPause();
        finish();
    }
}
