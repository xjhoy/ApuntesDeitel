package com.InicArreglo;

/**
 * Created by Jhoseph Arango on 02/10/2015.
 */

public class InicArreglo {
    public static void main(String[] args) {
        int[] arreglo;
        arreglo = new int[10];
        System.out.printf("%s%8s\n","Indice","Valor");
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.printf("%6d%8d\n",i,arreglo[i]);
        }

        // Arreglo biDimensional

        int[][]arreglo1 ={{11,12,13},{14,15,16}};// arreglo de 2
        int[][]arreglo2 = {{21,22,},{23},{24,25,26}};// arreglo de 3
        System.out.println("\nLos valores en arreglos1 por fila son");
        imprimirArreglo(arreglo1);// pasamos el metodo imprimir los arreglos en forma de tabla

        System.out.println("\nLos valores en arreglos2 por fila son");
        imprimirArreglo(arreglo2);

    }

    public static void imprimirArreglo(int[][]arreglo){

        /*Hacemos un ciclo que:
        * Mide el arreglo para obtener el numero dimensiones o contenedores posee*/
        for (int fila = 0; fila < arreglo.length ; fila++) {
            /*Luego hacemos un ciclo que:
            * Se repite por el numero de valores que posee en la dimension*/
            for (int columna = 0; columna < arreglo[fila].length ; columna++) {
                /*Ahora imprimimos el valor que esta en esa fila y pasamos la columna que nos
                * dira el varlor que se aloja*/
                System.out.printf("%d ",arreglo[fila][columna]);
            }
            System.out.println();
        }

    }
}
