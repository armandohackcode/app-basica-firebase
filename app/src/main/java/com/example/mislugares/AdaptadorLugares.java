package com.example.mislugares;

;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorLugares extends RecyclerView.Adapter<AdaptadorLugares.ViewHolder> {

    private LayoutInflater inflater;
    List<Lugar> listaLugares;
    private Context context;

    public AdaptadorLugares(List<Lugar> listaLugares, Context context) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listaLugares = listaLugares;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.elemento_lugar,null);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Lugar lugar = listaLugares.get(position);
        holder.nombre.setText(lugar.nombre);
        holder.descripcion.setText(lugar.descripcion);
    }

    @Override
    public int getItemCount() {
        Log.i("Cantidad de elementos",String.valueOf(listaLugares.size()));
        return listaLugares.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public  TextView descripcion;

        public ViewHolder(View itemView){
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            descripcion = (TextView) itemView.findViewById(R.id.descripcion);
        }
    }
}
