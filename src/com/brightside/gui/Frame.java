package com.brightside.gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {

        this.add(new GamePanel());
        this.setTitle("Wild Life Simulation");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

//    public void paintComponent(Graphics g) {
//        super.paintComponents(g);
//        draw(g);
//    }
//    public void draw(Graphics g) {
//        for (int i = 0; i < (CUSTOM_FRAME[0] / CELL_SIZE); i++) {
//            g.drawLine(i*CELL_SIZE, 0, i*CELL_SIZE, CUSTOM_FRAME[0]);
//        }
//    }


}
