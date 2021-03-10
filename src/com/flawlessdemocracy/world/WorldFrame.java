
package com.flawlessdemocracy.world;

import javax.swing.JInternalFrame;
import javax.swing.Timer;

public final class WorldFrame extends JInternalFrame {
        
    private final Timer timer;
    private final WorldCanvas canvas;
    
    public WorldFrame(String title, WorldCanvas canvas) {
        super(title, false, true, false, true);
        this.canvas = canvas;
        
        this.timer = new Timer(150, e -> {
            canvas.iterate(1);
            repaint();
        });
        timer.setRepeats(true);
        
        add(canvas);
        pack();
        setVisible(true);
    }
    
    public void start() {
        timer.start();
    }
    
    public void stop() {
        timer.stop();
    }
}
