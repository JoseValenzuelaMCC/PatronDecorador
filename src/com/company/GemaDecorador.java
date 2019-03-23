package com.company;

public abstract class GemaDecorador extends Jugador {

    @Override
    public abstract String getNombre();

    @Override
    public abstract String getHistorial();

    @Override
    public abstract int getPosicion();

    @Override
    public abstract void setPosicion(int pos);

}
