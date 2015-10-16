package app;

/**
 * Created by Jhoseph Arango on 07/10/2015.
 */
public class ArregloBidimensional {


    public static void main(String[] args) {
         int[][]arreglo = {
                {101,102,103,104,105},
                {201,202,203,204,205},
                {301,302,303,304,305}
        };
        int x = 0;
        System.out.printf("%8s","");
        for (int c = 1; c < 6 ; c++) {
            System.out.printf("%3sHora %d","",c);
        }
        System.out.println();
        for (int []valor : arreglo){
            System.out.printf("Clase %d:",++x);
            for (int valor2 : valor){
                System.out.printf("%9d",valor2);
            }
            System.out.println();

        }


    }

}
