package com.brightside;

import com.brightside.entities.inanimates.Grass;
import com.brightside.gui.Frame;

public class Main {

    public static void main(String[] args) {
        Grass grass = new Grass();
        System.out.println(grass.getX());
        System.out.println(grass.getY());


        new Frame(grass);
    }
}