package com.brightside.entities.creatures.animals;

import com.brightside.entities.creatures.Creature;

import java.awt.*;

public class Predator extends Creature {

    public Predator() {
        speed = 1;
        HP = 10;
    }

    @Override
    public Image getImage(int cellSize) {
        return t.getImage("src\\com\\brightside\\images\\predator_" + cellSize + ".png");
    }
}
