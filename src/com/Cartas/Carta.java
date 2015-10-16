package com.Cartas;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 */
public class Carta {
    private String cara;// cara de la cartas(As, dos...)
    private String palo;// palo de la carta(Corazones, Diamantes)

    public  Carta(String caraCarta, String paloCarta){
        cara = caraCarta;
        palo = paloCarta;
    }// fin del constructor de carta con 2 argumentos

    public String toString(){
        return cara + " de " + palo;
    }

}
