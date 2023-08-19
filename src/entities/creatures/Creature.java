package entities.creatures;

import entities.Entity;

public abstract class Creature extends Entity {

    protected int speed;
    protected int HP;

    /**
     * Существо делает ход
     */
    public abstract void makeMove();

}
