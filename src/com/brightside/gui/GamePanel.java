package com.brightside.gui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private final static short[] CUSTOM_FRAME = {800, 600};
    private final static short CELL_SIZE = 25;

    protected GamePanel() {
        this.setPreferredSize(new Dimension(CUSTOM_FRAME[0], CUSTOM_FRAME[1]));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    protected void draw(Graphics g) {
        for (int i = 0; i < (CUSTOM_FRAME[0] / CELL_SIZE); i++) {
            g.drawLine(i*CELL_SIZE, 0, i*CELL_SIZE, CUSTOM_FRAME[1]);
            g.drawLine(0, i*CELL_SIZE, CUSTOM_FRAME[0], i*CELL_SIZE);
        }
    }
}
