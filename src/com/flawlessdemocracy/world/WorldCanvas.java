
package com.flawlessdemocracy.world;

import javax.swing.JComponent;

public abstract class WorldCanvas<WorldT extends World> extends JComponent {
    
    protected final WorldT world;
    
    public WorldCanvas(WorldT world) {
        this.world = world;
        setDoubleBuffered(true);
    }
    
    public abstract void update();
    
    public WorldT getWorld() {
        return world;
    }
}
