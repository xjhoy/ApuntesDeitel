package com.Tema7Arreglo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jhoseph Arango on 13/10/2015.
 */
public class temaSiete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]arreglo = new int[5];
        int[]arregloSalida = new int[5];
        boolean d = true;
        int n;
        int cnt;
        int len;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Escriba un numero de 10 - 100");
            arreglo[i] = entrada.nextInt();
        }

        len = 0;

        for (int j = 0; j < arreglo.length; j++) {
            Arrays.sort(arregloSalida);
            cnt = arreglo[j];
            n = Arrays.binarySearch(arregloSalida,cnt);
            if (n < 0){
                arregloSalida[len] = arreglo[j];
            }
        }
        Arrays.sort(arregloSalida);

        for (int v : arregloSalida){
            if (v != 0){
                System.out.printf("%d ",v);
            }
        }


        System.out.println();


    }


}
