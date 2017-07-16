package com.example.carlosrestrepo.tarea2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Inscripcion extends AppCompatActivity {

    TextView nom1,apell1, edad1, corr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent2=getIntent();
        Bundle extras =intent2.getExtras();
        String datoNombre=(String)extras.get("Nombre");
        String datoApellido=(String)extras.get("Apellido");
        String datoEdad=(String)extras.get("Edad");
        String datoCorreo=(String)extras.get("Correo");

        nom1=(TextView) findViewById(R.id.rNombre);
        nom1.setText("EL nombre del usuario es: "+datoNombre);
        apell1=(TextView) findViewById(R.id.rApell);
        apell1.setText("EL apellido del usuario es: "+datoApellido);
        edad1=(TextView) findViewById(R.id.rEdad);
        edad1.setText("La edad del usuario es: "+datoEdad);
        corr1=(TextView) findViewById(R.id.rCorr);
        corr1.setText("EL correo del usuario es: "+datoCorreo);
    }

}
