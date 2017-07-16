package com.example.carlosrestrepo.tarea2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Formulario extends AppCompatActivity implements OnClickListener{

    EditText nombreUsu;
    EditText apellidoUsu;
    EditText edadUsu;
    EditText correo1;

    String nom, apell, edad, cor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
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

        View botonGuarda=findViewById(R.id.botonGuardar);
        botonGuarda.setOnClickListener(this);
        nombreUsu=(EditText) findViewById(R.id.nombre);
        apellidoUsu=(EditText) findViewById(R.id.apellido);
        edadUsu=(EditText) findViewById(R.id.edad);
        correo1=(EditText) findViewById(R.id.email);

    }

    @Override
    public void onClick(View view) {

        nom=nombreUsu.getText().toString();
        apell= apellidoUsu.getText().toString();
        edad= edadUsu.getText().toString();
        cor= correo1.getText().toString();

        if(nom.equals("") && apell.equals("") && edad.equals("")
                && cor.equals("")) {
            Toast.makeText(this, "Por favor ingresar todos los datos ", Toast.LENGTH_LONG).show();



        }else {

                Intent intent = new Intent(view.getContext(), Inscripcion.class);
                startActivityForResult(intent, 0);

                intent.putExtra("Nombre", nom);
                intent.putExtra("Apellido", apell);
                intent.putExtra("Edad", edad);
                intent.putExtra("Correo", cor);


                startActivity(intent);

        }

    }
}
