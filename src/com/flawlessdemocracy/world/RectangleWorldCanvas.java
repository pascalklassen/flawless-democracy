
package com.flawlessdemocracy.world;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public final class RectangleWorldCanvas extends WorldCanvas {
    
    public RectangleWorldCanvas(RectangleWorld world) {
        super(world);
        setSize(400, 400);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Random random = new Random(System.currentTimeMillis());
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int bw = 2;
                int bh = 2;
                
                int w = (getWidth() / 20) - bw;
                int h = (getHeight() / 20) - bh;
                
                int x = j * (w + bw) + (bw / 2);
                int y = i * (h + bh) + (bh / 2);
                
                g2d.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                g2d.fillRect(x, y, w, h);
            }
        }
    }
}
