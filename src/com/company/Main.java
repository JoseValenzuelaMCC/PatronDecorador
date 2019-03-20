package com.company;

import com.company.Gemas.*;

public class Main {

    public static void main(String[] args) {
        Jugador jugador = new Guerrero("El Pariente");

        jugador = new Esmeralda(jugador);
        jugador = new Kryptonita(jugador, 3);
        jugador = new Ruby(jugador);
        jugador = new Onice(jugador);
        jugador = new Zafiro(jugador);
        jugador = new Diamante(jugador);


        System.out.println(jugador.getNombre());
        System.out.println(jugador.getHistorial());
        System.out.println("Poder final: " + jugador.getPoder());

    }
}
