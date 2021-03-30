
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.Party;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

public final class TileWorldRenderer extends SwingWorker<Void, Void> {
    
    private final TileWorldCanvas canvas;
    private final TileWorldResult result;
    private final DefaultTableModel table;
    
    private int interval;
    private boolean paused = false;
    
    public TileWorldRenderer(TileWorldCanvas canvas, int interval, DefaultTableModel table) {
        this.canvas = canvas;
        this.interval = interval;
        this.result = new TileWorldResult(canvas.getWorld());
        this.table = table;
    }

    @Override
    protected Void doInBackground() throws Exception {
        int c = 0;
        int ac = 0;
        
        while (!isCancelled() && !result.isDone()) {
            if (!isPaused()) {
                if (c >= interval) {
                    canvas.update();
                    //updateTable(ac);
                    c = 0;
                }
                
                ac++;
                c++;
            }
        }
        
        return null;
    }
    
    private void updateTable(int c) {
        
        List<Party> parties = canvas.getWorld().getParties();
        List<Blob> blobs = canvas.getWorld().getBlobs();
        
        for (int i = 0; i < parties.size(); i++) {
            Party party = parties.get(i);
            int pc = 0;
            
            table.setValueAt(pc + " %", 0, 0);
            
            for (Blob blob : blobs) {
                if (blob.getParty().equals(party)) pc++;
            }
            
            
        }
    }
    
    public synchronized void setInterval(int interval) {
        this.interval = interval;
    }
    
    public synchronized void pause() {
        paused = true;
    }
    
    public synchronized void unpause() {
        paused = false;
    }
    
    public boolean isPaused() {
        return paused;
    }
}
