package com.example.alumno.clase_06;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private List<Persona> personaList;

    public MyAdapter(List<Persona> personaList)
    {
        this.personaList = personaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        Log.d("OnCreateVH", "Método llamado");
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Persona p = this.personaList.get(position);

        holder.tvNombre.setText(p.getNombre());
        holder.tvApellido.setText(p.getApellido());
        Log.d("OnBindVH", "Método llamado");
    }

    @Override
    public int getItemCount() {
        Log.d("getItemCount", "Método llamado");
        return this.personaList.size();
    }
}
