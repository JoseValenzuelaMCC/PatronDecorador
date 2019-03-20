package com.company;

public class Guerrero extends Jugador {

    private int posicion = 0;

    public Guerrero(String a){
        super.nombre = a;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public int getPoder() {
        return 4;
    }
}
