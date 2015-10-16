package com.Tema8.Tiempo;

/**
 * Created by Jhoseph Arango on 16/10/2015.
 */
public class Tiempo1 {

    private int hora;
    private int minuto;
    private int segundo;

    // establece un nuevo valor de tiempo, usando la hora universal;
    // lanza una excepción si la hora, minuto, segundo son validos

    public void establecerTiempo(int h, int m, int s)
    {
        // valida la hora, el minuto y el segundo
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) &&
                (s >= 0 && s < 60))
        {
            hora    = h;
            minuto  = m;
            segundo = s;
        } //  fin de if
        else
        {
            throw new IllegalArgumentException("hora, minuto o segundo estaban fuera de rango");
        }
    }

    // convierte a objeto String en formato de hora universal(HH:MM:SS)
    public String aStringUniversal()
    {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // convierte a objeto String en formato de hora estandar (HH:MM:SS AM o PM)
    public String toString()
    {
        return String.format("%02d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto,segundo,(hora < 12 ? "AM":"PM"));
    }


}
