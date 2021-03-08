
package com.flawlessdemocracy.world;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JComponent;

public abstract class WorldCanvas extends JComponent {
    
    protected final World world;
    
    public WorldCanvas(World world) {
        this.world = world;
        setDoubleBuffered(true);
    }
}
