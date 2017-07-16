package com.example.carlosrestrepo.tarea2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private int duracion= 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] nomLista ={"Universidad Manuela Beltrán","Buscador","Registro"};
        ListAdapter Adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomLista);

        final ListView lista = (ListView) findViewById(R.id.lista);

        lista.setAdapter(Adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                int itemPosition = i;
                String valor = (String) lista.getItemAtPosition(i);

                final int result = 1;

                switch (valor){
                    case "Universidad Manuela Beltrán":
                        Intent UniversidadS= new Intent(MainActivity.this, Universidad.class);
                        MainActivity.this.startActivity(UniversidadS);
                        break;
                    case "Buscador":
                        Intent BuscadorB= new Intent(MainActivity.this, Buscador.class);
                        MainActivity.this.startActivity(BuscadorB);
                        break;
                    case "Registro":
                        Intent RegistroR= new Intent(MainActivity.this, Formulario.class);
                        MainActivity.this.startActivity(RegistroR);
                        break;
                }


            }
        });


    }
}
