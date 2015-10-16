package com.IniArreglo2;

import java.util.ArrayList;

/**
 * Created by Jhoseph Arango on 14/10/2015.
 */
public class ColeccionArrayList {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<String>();

        elementos.add("rojo");
        elementos.add(0,"amarillo");

        System.out.print("Mostrar contenido de lista con ciclo controlado por contador: ");

        for (int i = 0; i < elementos.size(); i++) {
            System.out.printf("%s ",elementos.get(i));
        }
        mostrar(elementos,"\nMostrar contenido de lista con instruccion for mejorada");

        elementos.add("verde");
        elementos.add("amarillo");
        mostrar(elementos,"\nMostrar lista con dos elementos nuevos");

        elementos.remove("amarillo"); // elimina el primer amarillo

        mostrar(elementos,"Elimina primer instancia de 'amarillo':");

        elementos.remove(1);
        mostrar(elementos,"Eliminar el indice 1 'verde':");

        System.out.printf("\"rojo\" %sesta en la lista\n",elementos.contains("rojo")?"":"no ");

        System.out.printf("Tamaño: %s\n",elementos.size());
    }

    public static void mostrar(ArrayList< String > elementos,String encabezado){
        System.out.printf("%s",encabezado);
        for (String elemento : elementos){
            System.out.printf(" %s", elemento);
        }
        System.out.println();
    }
}
