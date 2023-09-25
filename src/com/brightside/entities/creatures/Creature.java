package com.brightside.entities.creatures;

import com.brightside.entities.Entity;

public abstract class Creature extends Entity {

    protected int speed;
    protected int HP;

    /**
     * Существо делает ход. В идеале (если существо не располагается по краям) существует 8 вариантов движения. Все варианты сейчас учтены
     *
     * @return массив координат. На текущем этапе пока не сохраняются у объекта
     */
    public int[] makeMove() {
        int[] move;
        int[] coordinates;

        do {
            move = MOVE_COMBINATION.get(rnd.nextInt(0, MOVE_COMBINATION.size()));
            coordinates = new int[]{x + (move[0] * cellSize), y + (move[1] * cellSize)};
        } while ((x + (move[0] * cellSize)) < 0 || (x + (move[0] * cellSize)) > customFrame[0] ||
                (y + (move[1] * cellSize)) < 0 || (y + (move[1] * cellSize)) > customFrame[1]);

        return coordinates;
    }


}
