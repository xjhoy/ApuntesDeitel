package Calificaciones.LibroCalificaciones;

/**
 * Created by Jhoseph Arango on 06/10/2015.
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private  int[][] calificaciones;

    public LibroCalificaciones(String nombre, int[][]arregloCalif){
        nombreDelCurso = nombre;
        calificaciones = arregloCalif;
    }

    public  void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaiones para\n%s!\n\n",
                obtenerNombreDelCurso());
    }

    public void procesarCalificaciones(){
        imprimirCalificaciones();
        System.out.printf("\n%s %d\n%s %d\n\n",
                "La calificación mas baja en el libro de calificaciones es",
                obtenerMinima(),
                "La calificacion mas alta en el libro de calificaciones es",
                obtenerMaxima());
        imprimirGraficoBarras();
        
    }

    private void imprimirGraficoBarras() {
        System.out.printf("Distribución de calificaciones en general:\n");
        // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];
        for (int[]califEstudiantes : calificaciones){
            for (int calificacion : califEstudiantes){
                ++frecuencia[calificacion / 10];
            }
        }
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            if (cuenta == 10){
                System.out.printf("%5d: ",100);
            }else{
                System.out.printf("%02d-%02d: ",cuenta * 10, cuenta * 10 + 9);
            }

            for (int estrillas = 0; estrillas < frecuencia[cuenta]; estrillas++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }

    public int obtenerMaxima() {
        int califAlta = calificaciones[0][0];
        for (int[]califEstudiantes: calificaciones){
            for (int calificacion : califEstudiantes){
                if (calificacion > califAlta){
                    califAlta = calificacion;
                }
            }
        }
        return califAlta;
    }

    public int obtenerMinima() {
        int califBaja = calificaciones[0][0];
        for (int[] califEstudiantes : calificaciones){
            for (int calificacion : califEstudiantes){
                if (calificacion < califBaja){
                    califBaja = calificacion;
                }
            }
        }
        return califBaja;
    }

    public double obtenerPromedio(int[] conjuntoDeCalif){
        int total = 0;
        for (int calificacion : conjuntoDeCalif){
            total += calificacion;
        }
        return (double)total/ conjuntoDeCalif.length;
    }

    public void imprimirCalificaciones() {
        System.out.printf("Las calificaciones son:\n");
        System.out.print("               ");
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d  ", prueba + 1);
        }
        System.out.printf("%s\n","Promedio");

        for (int estudiante = 0; estudiante < calificaciones.length ; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);
            for (int prueba : calificaciones[estudiante]){
                System.out.printf("%10d",prueba);
            }
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%10.2f\n",promedio);
        }
    }
}
