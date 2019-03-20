package com.company.Gemas;

import com.company.GemaDecorador;
import com.company.Guerrero;
import com.company.Jugador;

public class Ruby extends GemaDecorador {
    Jugador guerrero;

    public Ruby(Jugador guerrero){
        this.guerrero = guerrero;
    }

    @Override
    public int getPoder() {
        return this.guerrero.getPoder() + 5;
    }

    @Override
    public String getHistorial() {
        return this.guerrero.getHistorial() + "\nRuby: +5";
    }

    @Override
    public String getNombre() {
        return this.guerrero.getNombre();
    }
}
