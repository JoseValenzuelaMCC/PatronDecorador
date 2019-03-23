package com.company.Gemas;

import com.company.GemaDecorador;
import com.company.Jugador;

public class Esmeralda extends GemaDecorador {
    Jugador guerrero;

    public Esmeralda(Jugador guerrero){
        this.guerrero = guerrero;
    }

    @Override
    public String getHistorial() {
        return guerrero.getHistorial() + "\nEsmeralda: +2 ";
    }

    @Override
    public int getPoder() {
        return this.guerrero.getPoder() + 2;
    }

    @Override
    public String getNombre() {
        return this.guerrero.getNombre();
    }

    @Override
    public int getPosicion() {
        return this.guerrero.getPosicion();
    }

    @Override
    public void setPosicion(int pos) {
        this.guerrero.setPosicion(pos);
    }
}
