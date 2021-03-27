
package com.flawlessdemocracy.world;

import javax.swing.SwingWorker;

public final class WorldRenderer extends SwingWorker<Void, Void> {
    
    private final WorldCanvas canvas;
    
    private int interval;
    private boolean paused = false;
    
    public WorldRenderer(WorldCanvas canvas, int interval) {
        this.canvas = canvas;
        this.interval = interval;
    }

    @Override
    protected Void doInBackground() throws Exception {
        int c = 0;
        
        while (!isCancelled()) {
            if (!paused) {
                if (c >= interval) {
                    canvas.update();
                    c = 0;
                }

                c++;
            }
        }
        
        return null;
    }
    
    public synchronized void setInterval(int interval) {
        this.interval = interval;
    }
    
    public synchronized void pause() {
        paused = true;
    }
    
    public synchronized void unpause() {
        paused = false;
        //notify();
    }
    
    public boolean isPaused() {
        return paused;
    }
}
