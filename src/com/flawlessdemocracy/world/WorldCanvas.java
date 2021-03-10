
package com.flawlessdemocracy.world;

import javax.swing.JComponent;

public abstract class WorldCanvas<WorldT extends World> extends JComponent {
    
    protected final WorldT world;
    
    public WorldCanvas(WorldT world) {
        this.world = world;
        setDoubleBuffered(true);
    }
    
    public void iterate(int n) {
        world.iterate(n);
    }
}
