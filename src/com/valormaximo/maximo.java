package com.valormaximo;
import java.util.Scanner;
/**
 * Created by Jhoseph Arango on 02/10/2015.
 */
public class maximo {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el maximo de 3 numeros decimales");
        System.out.println("(Escribir el punto decimal con una  coma ',' ej 5,1)");
        // Objeto
        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double num3 = entrada.nextDouble();
        /* PUBLIC STATIC:   de esta forma podemos llamar a un metodo que este
                      en la misma clase y que tambien sea static.
                      si no es static tendremos que llamar al metodo de la siguiente manera
                        maximo nm = new maximo();
                        double resultado = nm.numMax(num1, num2, num3); */
        double resultado = numMax(num1, num2, num3);
        System.out.printf("%.1f ",resultado);
    }
    public static  double numMax(double n1, double n2, double n3){

        /*double r = n1;
        if (r < n2){
            r = n2;
        }
        if(r < n3){
            r = n3;
        }
        return r;*/
        return Math.max(n1, Math.max(n2,n3));
    }
}
