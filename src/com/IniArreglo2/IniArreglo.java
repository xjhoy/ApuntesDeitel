package com.IniArreglo2;

/**
 * Created by Jhoseph Arango on 07/10/2015.
 */
public class IniArreglo {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.printf("Error: Vuelva a escribir el completo, incluyendo\n" +
                    "el tamaño del arreglo, el valor inicial y el incremento");
        }else{
            // obtiene el tamaño del arreglo del primer argumento de la linea de comandos
            int longitudArreglo = Integer.parseInt(args[0]);
            int []arreglo = new int[longitudArreglo];

            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);

            // asignamos el valor para cada elemento del arreglo
            for (int contador = 0; contador < arreglo.length; contador++) {
                arreglo[contador] = valorInicial + incremento * contador;
            }

            System.out.printf("%s%8s\n","Indice","Valor");

            for (int contador = 0; contador < arreglo.length ; contador++) {
                System.out.printf("%5d%8d\n",contador,arreglo[contador]);
            }

        }

    }
}
