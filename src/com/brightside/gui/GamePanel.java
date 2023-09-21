package com.brightside.gui;

import com.brightside.entities.Entity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Создаёт верхнеуровневый контейнер JPanel для визуализации поля
 */
public class GamePanel extends JPanel {
    private final static short[] CUSTOM_FRAME = {800, 600}; // должен '%'на CELL_SIZE
    private final static short CELL_SIZE = 25; // ТОЛЬКО 25 и 50
    private static HashMap<String, ArrayList<Entity>> dictionary;

    protected GamePanel(HashMap<String, ArrayList<Entity>> dictEntities) {
        setPreferredSize(new Dimension(CUSTOM_FRAME[0], CUSTOM_FRAME[1]));
        dictionary = dictEntities;
        System.out.println(this.dictionary);
    }

    /**
     *
     * @param g the <code>Graphics</code> object to protect
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    /**
     * Отрисовывает сетку
     * @param g
     */
    protected void draw(Graphics g) {
        for (int i = 0; i < (CUSTOM_FRAME[0] / CELL_SIZE); i++) {
            g.drawLine(i*CELL_SIZE, 0, i*CELL_SIZE, CUSTOM_FRAME[1]);
            g.drawLine(0, i*CELL_SIZE, CUSTOM_FRAME[0], i*CELL_SIZE);
        }

        for (String name : dictionary.keySet()) {
            for (Entity entity : dictionary.get(name)) {
                g.drawImage(entity.getImage(CELL_SIZE), entity.getX(), entity.getY(), this);
            }
        }

//        for (Entity ent : dictionary.get("Grass")) {
//            g.drawImage(ent.getImage(CELL_SIZE), ent.getX(), ent.getY(), this);
//        }
//        g.drawImage(object.getImage(CELL_SIZE), object.getX(), object.getY(), this);
    }

    /**
     * Возвращает размер клетки поля
     * @return размер клетки [CELL_SIZE]
     */
    public static short getCellSize() {return CELL_SIZE;}

    /**
     * Возвращает размер поля
     * @return размер поля [CUSTOM_FRAME]
     */
    public static short[] getCustomFrame() {return CUSTOM_FRAME;}

}
