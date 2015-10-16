package com.MetodoMath;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 */
public class PruebaMath {

    public static void main(String[] args) {
        System.out.printf("Math.abs: Valor absoluto\n");
        System.out.printf(" Math.abs(23.7) = %f\n", Math.abs(23.7));
        System.out.printf(" Math.abs(0.0) = %f\n", Math.abs(0.0));
        System.out.printf(" Math.abs(-23.7) = %f\n\n", Math.abs(-23.7));

        System.out.printf("Math.ceil: redondea x al numero más pequeño que no sea menor de x\n");
        System.out.printf(" Math.ceil(9.2) = %f\n",Math.ceil(9.2));
        System.out.printf(" Math.ceil(9.8) = %f\n",Math.ceil(9.8));
        System.out.printf(" Math.ceil(-9.8) = %f\n\n",Math.ceil(-9.8));

        System.out.printf("Math.cos: Coseno trigonometrico de x (x está en radiantes)\n");
        System.out.printf(" Math.cos(0.0) = %f\n\n",Math.cos(0.0));

        System.out.printf("Math.exp: Metodo exponencial e*\n");
        System.out.printf(" Math.exp(1.0) = %f\n",Math.exp(1.0));
        System.out.printf(" Math.exp(2.0) = %f\n\n",Math.exp(2.0));


        System.out.printf("Math.floor: Redondea x al mas grande que no sea mayor de x\n");
        System.out.printf(" Math.floor(9.2) = %f\n",Math.floor(9.2));
        System.out.printf(" Math.floor(9.8) = %f\n\n",Math.floor(9.8));

        System.out.printf("Math.log: Logaritmo natural de x(base e)\n");
        System.out.printf(" Math.log(Math.E) = %f\n",Math.log(Math.E));
        System.out.printf(" Math.log(Math.E * Math.E) = %f\n\n",Math.log(Math.E * Math.E));

        System.out.printf("Math.max: El valor mas grande de X y Y\n");
        System.out.printf(" Math.max(5.3,12.6) = %f\n",Math.max(5.3,12.6));
        System.out.printf(" Math.max(15.3,Math.max(2.3,23.1)) = %f\n\n",Math.max(15.3,Math.max(2.3,23.1)));

        System.out.printf("Math.min: El valor mas grande de X y Y\n");
        System.out.printf(" Math.min(5.3,12.6) = %f\n",Math.min(5.3, 12.6));
        System.out.printf(" Math.min(15.3,Math.min(2.3,23.1)) = %f\n\n",Math.min(15.3, Math.min(2.3, 23.1)));

        System.out.printf("Math.pow: X elevado a la potencia Y\n");
        System.out.printf(" Math.pow(5,2) = %f\n\n",Math.pow(5,2));

        System.out.printf("Math.sin: Seno trigonometrico de X(X está en radianes)\n");
        System.out.printf(" Math.sin(0.0) = %f\n",Math.sin(0.0));
        System.out.printf(" Math.sin(9.2) = %f\n\n",Math.sin(9.2));

        System.out.printf("Math.sqrt: Raiz cuadrada de X\n");
        System.out.printf(" Math.sqrt(900) = %f\n\n",Math.sqrt(900));

        System.out.printf("Math.tan: Tangente trigonometrica de X(X esta en radianes)\n");
        System.out.printf(" Math.tan(0.0)",Math.tan(0.0));


    }
}
