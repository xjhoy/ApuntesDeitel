package com.caritafeliz;

import javax.swing.*;

/**
 * Created by Jhoseph Arango on 02/10/2015.
 */
public class PruebaCaritaFeliz {
    public static void main(String[] args) {

        DibujarCaritaFeliz cara = new DibujarCaritaFeliz();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(cara);
        app.setSize(230,250);
        app.setVisible(true);
    }
}
