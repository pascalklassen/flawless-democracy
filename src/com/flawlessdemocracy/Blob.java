
package com.flawlessdemocracy;

import java.awt.Dimension;
import javax.swing.JPanel;

public final class Blob {
    
    public static final Dimension CELL_SIZE_DIMENSION = new Dimension(10, 10);
    
    private final Position position;
    private Party party;
    
    private final JPanel panel;
    
    public Blob(Position position, Party party) {
        this.position = position;
        this.party = party;
        this.panel = new JPanel();
        panel.setPreferredSize(CELL_SIZE_DIMENSION);
        
        repaint();
    }
    
    private void repaint() {
        panel.setBackground(getParty().getColor());
        panel.repaint();
    }
    
    public Position getPosition() {
        return position;
    }
    
    public Party getParty() {
        return party;
    }
    
    public void setParty(Party party) {
        this.party = party;
        repaint();
    }
    
    public JPanel getPanel() {
        return panel;
    }
}
