package com.brightside.gui;

import com.brightside.entities.inanimates.Grass;

import javax.swing.*;

/**
 *  Класс создаёт тяжёлый элемент окно GUI, в котором будет происходить вся визуализация
 */
public class Frame extends JFrame {

    /**
     * Конструктор инициализации окна
     */
    public Frame(Grass object) {

        this.add(new GamePanel(object));
        this.setTitle("Wild Life Simulation");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
