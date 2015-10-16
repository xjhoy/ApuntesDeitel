package com.caritafeliz;

/**
 * Created by Jhoseph Arango on 02/10/2015.
 */

import  java.awt.Color;
import  java.awt.Graphics;
import  javax.swing.JPanel;


public class DibujarCaritaFeliz extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        // dibuja una cara
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.yellow);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }

}
