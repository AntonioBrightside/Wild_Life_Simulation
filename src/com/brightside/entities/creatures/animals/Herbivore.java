package com.brightside.entities.creatures.animals;

import com.brightside.entities.creatures.Creature;
import java.awt.*;

public class Herbivore extends Creature {

    @Override
    public Image getImage(short cellSize) {
        return t.getImage("src\\com\\brightside\\images\\herbivore_" + cellSize + ".png");
    }

    @Override
    public void makeMove() {
    }
}
