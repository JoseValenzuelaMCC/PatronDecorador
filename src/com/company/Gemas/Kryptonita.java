package com.company.Gemas;

import com.company.GemaDecorador;
import com.company.Guerrero;
import com.company.Jugador;

public class Kryptonita extends GemaDecorador {
    Jugador guerrero;
    Integer poderKryptonita;

    public Kryptonita(Jugador guerrero, Integer valorKryptonita){
        this.guerrero = guerrero;
        this.poderKryptonita = valorKryptonita;
    }

    @Override
    public String getHistorial() {
        return this.guerrero.getHistorial() + "\nKryptonita: -" + this.poderKryptonita;
    }

    @Override
    public int getPoder() {
        return this.guerrero.getPoder() - this.poderKryptonita;
    }

    @Override
    public String getNombre() {
        return this.guerrero.getNombre();
    }
}
