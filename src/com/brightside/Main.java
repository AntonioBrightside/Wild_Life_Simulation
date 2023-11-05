package com.brightside;

import com.brightside.gui.Frame;
import com.brightside.simulation.Actions;
import com.brightside.simulation.Map;

import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Map map = new Map();
        Actions actions = new Actions(map);

        Frame frame = new Frame(map.getMap());
        frame.setVisible(true);

        int i = 0;
        while (i <= 5) {
            TimeUnit.SECONDS.sleep(2);
            actions.makeMove(map);
            frame.repaint();
            System.out.println("Make move");
            i++;
        }
    }
}