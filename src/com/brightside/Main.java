package com.brightside;

import com.brightside.gui.Frame;
import com.brightside.simulation.Map;


public class Main {

    public static void main(String[] args) {

        Map map = new Map();
        Frame frame = new Frame(Map.getDict());

    }
}