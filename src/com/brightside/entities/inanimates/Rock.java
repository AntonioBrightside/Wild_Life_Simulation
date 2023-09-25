package com.brightside.entities.inanimates;

import com.brightside.entities.Entity;

import java.awt.*;

public class Rock extends Entity {

    @Override
    public Image getImage(int cellSize) {
        return t.getImage("src\\com\\brightside\\images\\stone_" + cellSize + ".png");
    }
}

