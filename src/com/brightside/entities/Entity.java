package com.brightside.entities;

import com.brightside.gui.GamePanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Абстрактный класс, который описывает объект на поле и его возможности.
 */
public abstract class Entity {
    protected static Toolkit t = Toolkit.getDefaultToolkit();
    protected static Random rnd = new Random();
    protected int x;
    protected int y;

    protected static final ArrayList<int[]> MOVE_COMBINATION = new ArrayList<>(
            Arrays.asList(new int[]{-1, -1}, new int[]{0, -1}, new int[]{1, -1}, new int[]{-1, 0}, new int[]{1, 0},
                    new int[]{-1, 1}, new int[]{0, 1}, new int[]{1, 1}));

    protected Entity() {
        this.setRandomCoordinates();
    }

    /**
     * Метод возвращает картинку
     *
     * @param cellSize размер клетки, под которую подбирается картинка
     * @return путь к картинке
     */
    public abstract Image getImage(int cellSize);

    /**
     * Метод создаёт псевдослучайные координаты объекта на поле
     */
    public void setRandomCoordinates() {
        int cellSize = GamePanel.getCellSize();
        int[] customFrame = GamePanel.getCustomFrame();

        x = (rnd.nextInt(0,
                (customFrame[0] / cellSize)) * cellSize);
        y = (rnd.nextInt(0,
                (customFrame[1] / cellSize)) * cellSize);
    }

    /**
     * Метод принимает массив и меняет координаты объекта на поле
     * @param coordinates координаты на поле [x, y]
     */
    public void setCoordinate(int[] coordinates) {
        x = coordinates[0];
        y = coordinates[1];
    }

    /**
     * Возвращает координаты объекта [x, y]
     *
     * @return int [x, y]
     */
    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    /**
     * Возвращает координату Х объекта
     *
     * @return X
     */
    public int getX() {
        return x;
    }

    /**
     * Возвращает координату Y объекта
     *
     * @return Y
     */
    public int getY() {
        return y;
    }


}


