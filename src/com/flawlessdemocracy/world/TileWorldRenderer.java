
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Cell;
import com.flawlessdemocracy.Party;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

public final class TileWorldRenderer extends SwingWorker<Void, Void> {
    
    private final TileWorldCanvas canvas;
    private final DefaultTableModel table;
    
    private int interval;
    private boolean paused = false;
    
    public TileWorldRenderer(TileWorldCanvas canvas, int interval, DefaultTableModel table) {
        this.canvas = canvas;
        this.interval = interval;
        this.table = table;
    }

    @Override
    protected Void doInBackground() throws Exception {
        int c = 0;
        
        while (!isCancelled() && !isDictatorship()) {
            if (!isPaused()) {
                if (c >= interval) {
                    canvas.update();
                    c = 0;
                }
                
                c++;
            }
        }
        
        updateTable();
        
        return null;
    }
    
    private boolean isDictatorship() {
        return canvas.getWorld().getCells()
                .stream()
                .map(Cell::getColor)
                .allMatch(color -> color.equals(
                        canvas.getWorld().getCells().get(0).getColor())
                );
    }
    
    private void updateTable() {
        List<Party> parties = canvas.getWorld().getParties();
        List<Cell> cells = canvas.getWorld().getCells();
        
        for (int i = 0; i < parties.size(); i++) {
            Party party = parties.get(i);
            int partyCount = 0;
            
            for (Cell cell : cells) {
                if (cell.getColor().equals(party.getColor())) partyCount++;
            }
            
            table.setValueAt((int) (((float) partyCount / cells.size()) * 100) + " %", i, 1);
        }
    }
    
    public synchronized void setInterval(int interval) {
        this.interval = interval;
    }
    
    public synchronized void pause() {
        updateTable();
        paused = true;
    }
    
    public synchronized void unpause() {
        paused = false;
    }
    
    public boolean isPaused() {
        return paused;
    }
}
