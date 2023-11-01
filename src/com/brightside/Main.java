package com.brightside;

import com.brightside.gui.Frame;
import com.brightside.simulation.Actions;
import com.brightside.simulation.Map;


public class Main {

    public static void main(String[] args) {
        Map map = new Map();
        Actions actions = new Actions(map);

        Frame frame = new Frame(map.getMap());
        frame.setVisible(true);
    }
}