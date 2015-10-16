package com.Cartas;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 */
public class PruebaPaqueteDeCartas {
    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();
        for (int i = 1; i <= 52 ; i++) {
            System.out.printf("%-24s",miPaqueteDeCartas.repartirCarta());
            if (i % 4 == 0)
                System.out.println();
        }
    }
}
