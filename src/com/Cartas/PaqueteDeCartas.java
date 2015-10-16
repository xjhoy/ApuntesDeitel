package com.Cartas;

import java.util.Random;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 */
public class PaqueteDeCartas {
    private Carta []paquete;// arreglo de objeto Carta
    private int cartaActual;// subindice de la siguiente Carta a repartir(0 a 51)
    private static final int NUMERO_DE_CARTAS = 52;// numero constante de Cartas
    // generador de numeros aleatorios
    private  static final Random numerosAleatorios = new Random();

    // el constructor llena el paquete de Cartas
    public PaqueteDeCartas(){
        String []caras = {
                "As", "Dos", "Tres","Cuatro",
                "Cinco", "Seis", "Siete", "Ocho",
                "Nueve", "Diez", "Joto", "Quina", "Rey"
        };
        String []palos ={"Corazones","Diamantes","Treboles","Espadas"};

        paquete = new Carta[NUMERO_DE_CARTAS];// crea arreglo de objeto Carta
        cartaActual = 0;// establece la cartaActual para que la primer Carta repartida sea paquete[0]

        for (int cuenta = 0; cuenta < paquete.length ; cuenta++) {
            // Cuenta % 13 siempre devuelve un numero entre 0 a 12 y cuenta / 13 un numero entre 0 a 3
            paquete[cuenta] = new Carta(caras[cuenta % 13],palos[cuenta / 13]);
            
        }
    }

    public void barajar(){
        cartaActual = 0;
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }

    public Carta repartirCarta(){
        if (cartaActual < paquete.length)
            return paquete[cartaActual++];
        else
            return null;
    }


}

