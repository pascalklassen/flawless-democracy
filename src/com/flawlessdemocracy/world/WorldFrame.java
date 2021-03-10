
package com.flawlessdemocracy.world;

import javax.swing.JInternalFrame;
import javax.swing.Timer;

public final class WorldFrame extends JInternalFrame {
        
    private final Timer timer;
    private final WorldCanvas canvas;
    
    public WorldFrame(String title, WorldCanvas canvas) {
        super(title, false, true, false, true);
        this.canvas = canvas;
        
        this.timer = new Timer(5, e -> {
            canvas.iterate(500);
            
            canvas.revalidate();
            canvas.repaint();
        });
        timer.setRepeats(true);
        
        add(canvas);
        pack();
        setVisible(true);
    }
    
    public void start() {
        timer.start();
//        canvas.iterate(1);
//        canvas.revalidate();
//        canvas.repaint();
    }
    
    public void stop() {
        timer.stop();
    }
}
