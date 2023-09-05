package com.brightside.entities.inanimates;

import com.brightside.entities.Entity;

import java.awt.*;

public class Tree extends Entity {

    @Override
    public Image getImage(short cellSize) {
        return t.getImage("src\\com\\brightside\\images\\tree_" + cellSize + ".png");
    }
}
