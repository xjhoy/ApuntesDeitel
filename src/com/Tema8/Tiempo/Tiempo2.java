package com.Tema8.Tiempo;

/**
 * Created by Jhoseph Arango on 17/10/2015.
 */
public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor de tiempo2 sin argumentos:
    // inicializa cada variable en 0

    public Tiempo2(){
        this(0,0,0);
    }

    public Tiempo2(int h){
        this(h,0,0);
    }

    public Tiempo2(int h, int m){
        this(h,m,0);
    }

    public Tiempo2(int h, int m, int s){
        establecerTiempo(h, m, s);
    }

    public Tiempo2(Tiempo2 tiempo){
        this(tiempo.obtenerHora(),tiempo.obtenerMinuto(),tiempo.obtenerSegundo());
    }

    public void establecerTiempo(int h, int m, int s){
        establecerHora(h);
        establecerMinuto(m);
        establecerSegundo(s);
    }

    public void establecerHora(int h) {
        if (h >= 0 && h < 24){
            hora = h;
        }else{
            throw new IllegalArgumentException("Hora fuera de rango");
        }
    }

    public void establecerMinuto(int m){
        if (m >= 0 && m < 60){
            minuto = m;
        }else{
            throw new IllegalArgumentException("Minuto fuera de rango");
        }
    }

    public void establecerSegundo(int s){
        if (s >= 0 && s < 60){
            segundo = ((s >= 0 && s < 60) ? s : 0);
        }else{
            throw new IllegalArgumentException("Segundo fuera de rango");
        }
    }

    public int obtenerHora(){
        return hora;
    }

    public int obtenerMinuto(){
        return minuto;
    }

    public int obtenerSegundo(){
        return segundo;
    }

    public String aStringUniversal(){
        return String.format(
                "%02d:%02d:%02d",obtenerHora(),obtenerMinuto(),obtenerSegundo());

    }

    public String toString(){
        return String.format("%02d:%02d:%02d %s",
                (obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12,
                obtenerMinuto(),obtenerSegundo(),(obtenerHora() < 12 ? "AM" : "PM"));
    }


}




