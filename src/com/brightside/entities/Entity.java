package com.brightside.entities;

import com.brightside.gui.GamePanel;
import java.awt.*;
import java.util.Random;

/**
 * Абстрактный класс, который описывает объект на поле и его возможности.
 */
public abstract class Entity {
    protected static Toolkit t = Toolkit.getDefaultToolkit();
    protected Random rnd = new Random();
    protected short x;
    protected short y;

    protected Entity() {
        this.setCoordinates();
    }

    /**
     * Метод возвращает картинку
     * @return путь к картинке
     */
    public abstract Image getImage(short cellSize);

    /**
     * Метод создаёт координаты объекта на поле
     */
    public void setCoordinates() {
        x = (short) (rnd.nextInt(0,
                (GamePanel.getCustomFrame()[0] / GamePanel.getCellSize())) * GamePanel.getCellSize());
        y = (short) (rnd.nextInt(0,
                (GamePanel.getCustomFrame()[1] / GamePanel.getCellSize())) * GamePanel.getCellSize());
     }

     /**
      * Возвращает координату Х объекта
      * @return X
      */
    public short getX() {
        return x;
    }

    /**
     * Возвращает координату Y объекта
     * @return Y
     */
    public short getY() {
        return y;
    }
}
