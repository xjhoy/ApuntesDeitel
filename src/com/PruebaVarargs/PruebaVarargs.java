package com.PruebaVarargs;

/**
 * Created by Jhoseph Arango on 07/10/2015.
 */
public class PruebaVarargs {

    // pasamos un argumento de cantidad dinamica
    public static double promedio(double... numeros){
        double total = 0.0;
        for (double d : numeros){
            total += d;
        }
        return total / numeros.length;
    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("\nd1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4);
        System.out.printf("Promedio d1 y d2 = %.1f\n\n", promedio(d1,d2));
        System.out.printf("Promedio d1,d2 y d3 = %.1f\n\n", promedio(d1, d2, d3));
        System.out.printf("Promedio d1,d2,d3 y d4 = %.1f\n\n", promedio(d1, d2, d3,d4));


    }
}
