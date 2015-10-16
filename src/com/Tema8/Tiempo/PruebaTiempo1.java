package com.Tema8.Tiempo;

/**
 * Created by Jhoseph Arango on 16/10/2015.
 */
public class PruebaTiempo1 {
    public static void main(String[] args)
    {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print("La hora inicial universal es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora inicial estandar es: ");
        System.out.println(tiempo.toString());
        System.out.println();

        // modifica el tiempo e imprime el tiempo actualizado
        tiempo.establecerTiempo(13,27,6);
        System.out.print("La hora universal despues de establecerTiempo: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar despues de establecerTiempo: ");
        System.out.println(tiempo.toString());
        System.out.println();

        try{
            tiempo.establecerTiempo(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Excepcion: %s\n\n",e.getMessage());
        }
        System.out.println("Despues de insertar valores invalidos");
        System.out.print("La hora universal: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar: ");
        System.out.println(tiempo.toString());
        System.out.println();

    }
}
