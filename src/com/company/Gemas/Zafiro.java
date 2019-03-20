package com.company.Gemas;

import com.company.GemaDecorador;
import com.company.Jugador;

public class Zafiro extends GemaDecorador {
    Jugador guerrero;

    public Zafiro(Jugador guerrero){
        this.guerrero = guerrero;
    }

    @Override
    public String getHistorial() {
        return this.guerrero.getHistorial() + "\nZafiro: +3";
    }

    @Override
    public int getPoder() {
        return this.guerrero.getPoder() + 3;
    }

    @Override
    public String getNombre() {
        return this.guerrero.getNombre();
    }
}
