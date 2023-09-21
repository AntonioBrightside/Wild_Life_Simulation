package com.brightside.gui;

import com.brightside.entities.Entity;
import com.brightside.entities.inanimates.Grass;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *  Класс создаёт тяжёлый элемент - окно GUI, в котором будет происходить вся визуализация
 */
public class Frame extends JFrame {

    /**
     * Конструктор инициализации окна
     */
    public Frame(HashMap<String, ArrayList<Entity>> dictEntities) {

        add(new GamePanel(dictEntities));
        setTitle("Wild Life Simulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
