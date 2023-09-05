package com.brightside.entities.creatures.animals;

import com.brightside.entities.creatures.Creature;

import java.awt.*;

public class Predator extends Creature {

    @Override
    public Image getImage(short cellSize) {
        return t.getImage("src\\com\\brightside\\images\\predator_" + cellSize + ".png");
    }

    @Override
    public void makeMove() {
    }
}
