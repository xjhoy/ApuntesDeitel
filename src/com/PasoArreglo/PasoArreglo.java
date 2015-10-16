package com.PasoArreglo;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 * Paso de arreglos y elementos individuales de un arreglo a los métodos
 */
public class PasoArreglo {
    public static void main(String[] args) {
        int []arreglo = {1,2,3,4,5};
        System.out.printf("Efectos de pasar una referencia a un arreglo completo:" +
                "\nLos valores del arreglo original son:\n");
        // imprime los elementos originales del arreglo
        for (int valor : arreglo)
            System.out.printf(" %d", valor);
        modificarArreglo(arreglo);
        System.out.printf("\n\nLos valores del arreglo modificado son:\n");

        for (int valor : arreglo)
            System.out.printf(" %d",valor);

        System.out.printf("\n\nEfectos de pasar el valor de un elemento de arreglo:\n" +
                "arreglo[3] antes de modificarElemento: %d\n",arreglo[3]);

        modificarElemento(arreglo[3]);
        System.out.printf("arreglo[3] despues de modificarElemento: %d\n", arreglo[3]);
    }
    private static void modificarElemento(int elemento) {
        elemento *= 2;
        System.out.printf("Valor del elemento en modificar elemento: %d\n",elemento);
    }
    private static void modificarArreglo(int[] arreglo2) {
        for (int contador = 0; contador < arreglo2.length ; contador++) {
            arreglo2[contador] *= 2;
        }
    }
}
