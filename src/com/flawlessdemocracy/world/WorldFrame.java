
package com.flawlessdemocracy.world;

import javax.swing.JInternalFrame;

public final class WorldFrame extends JInternalFrame {
    
    public WorldFrame(String title, WorldCanvas canvas) {
        super(title, false, true, false, true);
        add(canvas);
        pack();
        setVisible(true);
    }
}
