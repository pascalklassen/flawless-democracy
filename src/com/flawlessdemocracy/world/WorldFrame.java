
package com.flawlessdemocracy.world;

import javax.swing.JInternalFrame;

public final class WorldFrame extends JInternalFrame {
    
    public WorldFrame(String title, World world) {
        super(title, false, true, false, true);
        add(new WorldCanvas(world));
        pack();
        setVisible(true);
    }
}
