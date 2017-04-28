package com.example.alumno.clase_06;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View v;
    TextView tvNombre;
    TextView tvApellido;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.v = itemView;
        this.tvNombre = (TextView)v.findViewById(R.id.TvNombre);
        this.tvApellido = (TextView)v.findViewById(R.id.TvApellido);
    }
}
