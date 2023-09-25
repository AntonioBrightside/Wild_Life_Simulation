package com.brightside.entities.inanimates;

import com.brightside.entities.Entity;
import java.awt.*;

public class Grass extends Entity {

    @Override
    public Image getImage(int cellSize) {
        return t.getImage("src\\com\\brightside\\images\\grass_" + cellSize + ".png");
    }
}
