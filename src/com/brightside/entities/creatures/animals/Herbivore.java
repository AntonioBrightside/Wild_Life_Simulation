package com.brightside.entities.creatures.animals;

import com.brightside.entities.creatures.Creature;
import java.awt.*;

public class Herbivore extends Creature {

    public Herbivore() {
        speed = 1;
        HP = 10;
    }

    @Override
    public Image getImage(int cellSize) {
        return t.getImage("src\\com\\brightside\\images\\herbivore_" + cellSize + ".png");
    }
}
