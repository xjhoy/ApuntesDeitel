package app;

/**
 * Created by Jhoseph Arango on 04/10/2015.
 */
public class Problema {
    public static void main(String[] args) {
        int [] arreglo = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j < 4 ; j++) {
                System.out.printf("%4d x %1d = %2d ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
