package com.company.Gemas;

import com.company.GemaDecorador;
import com.company.Jugador;

public class Diamante extends GemaDecorador {
    Jugador guerrero;

    public Diamante(Jugador guerrero){
        this.guerrero = guerrero;
    }

    @Override
    public String getHistorial() {
        return this.guerrero.getHistorial() + "\nDiamante: +8";
    }

    @Override
    public int getPoder() {
        return this.guerrero.getPoder() + 8;
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
