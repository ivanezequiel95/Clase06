package com.example.alumno.clase_06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPersonas = (RecyclerView) super.findViewById(R.id.rvPersonas);

        List<Persona> listPersona = new ArrayList<Persona>();
        listPersona.add(new Persona("1Ivan", "Ezequiel"));
        listPersona.add(new Persona("2Ivan", "Ezequiel"));
        listPersona.add(new Persona("3Ivan", "Ezequiel"));
        listPersona.add(new Persona("4Ivan", "Ezequiel"));
        listPersona.add(new Persona("5Ivan", "Ezequiel"));
        listPersona.add(new Persona("6Ivan", "Ezequiel"));
        listPersona.add(new Persona("7Ivan", "Ezequiel"));
        listPersona.add(new Persona("8Ivan", "Ezequiel"));
        listPersona.add(new Persona("9Ivan", "Ezequiel"));
        listPersona.add(new Persona("10Ivan", "Ezequiel"));
        listPersona.add(new Persona("11Ivan", "Ezequiel"));
        listPersona.add(new Persona("12Ivan", "Ezequiel"));
        listPersona.add(new Persona("13Ivan", "Ezequiel"));

        rvPersonas.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(listPersona);

        rvPersonas.setAdapter(adapter);

        //adapter.notifyDataSetChanged(); //cuando se agregan elementos nuevos, se renueva la lista


    }
}
