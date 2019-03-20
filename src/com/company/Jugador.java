package com.company;

public abstract class Jugador {
    String nombre = "";
    String historial = "----Historial----\n" +
            "Poder inicial: 4";

    public String getNombre() {
        return nombre;
    }

    public String getHistorial() {
        return historial;
    }

    public abstract int getPoder();
}
