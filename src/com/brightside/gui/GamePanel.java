package com.brightside.gui;

import com.brightside.entities.inanimates.Grass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Создаёт верхнеуровневый контейнер JPanel для визуализации поля
 */
public class GamePanel extends JPanel {
    private final static short[] CUSTOM_FRAME = {800, 600}; // должен '%'на CELL_SIZE
    private final static short CELL_SIZE = 25; // ТОЛЬКО 25 и 50
    private Grass object;

    protected GamePanel(Grass object) {
        this.setPreferredSize(new Dimension(CUSTOM_FRAME[0], CUSTOM_FRAME[1]));
        this.object = object;
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

//        Toolkit t = Toolkit.getDefaultToolkit();
//        Image rock = t.getImage("src\\com\\brightside\\images\\grass_25.png");
//        g.drawImage(rock, 25, 25, this);

        g.drawImage(object.getImage(CELL_SIZE), object.getX(), object.getY(), this);
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
