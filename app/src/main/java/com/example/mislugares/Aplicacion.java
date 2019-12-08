package com.example.mislugares;

import android.app.Application;

import java.util.List;

public class Aplicacion extends Application {
    private List<Lugar> listaLugares;
    private AdaptadorLugares adaptador;

    @Override
    public void onCreate() {

        listaLugares = Lugar.ejemploLugares();
        adaptador = new AdaptadorLugares(this,listaLugares);
    }

    public AdaptadorLugares getAdaptador() {
        return adaptador;
    }
    public List<Lugar> getListaLugares(){
        return listaLugares;
    }
}
