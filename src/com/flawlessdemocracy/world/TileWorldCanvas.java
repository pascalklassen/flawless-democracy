
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.world.position.Position2D;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public final class TileWorldCanvas extends WorldCanvas<TileWorld> {
    
    private final int cellWidth;
    private final int cellHeight;
    
    private final int borderWidth;
    private final int borderHeight;
    
    private final int rows;
    private final int columns;
    
    public TileWorldCanvas(TileWorld world, int cellSize, int borderWidth) {
        super(world);
        this.rows = world.getRows();
        this.columns = world.getColumns();
        
        this.cellWidth = cellSize;
        this.cellHeight = cellSize;
        
        this.borderWidth = borderWidth;
        this.borderHeight = borderWidth;
        
        setPreferredSize(new Dimension(cellWidth * columns, cellHeight * rows));
        
        world.randomize();
    }
    
    @Override
    public void update() {
        world.iterate();
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        world.getBlobs().forEach(blob -> {
            paintBlob(blob, (Graphics2D) g);
        });
    }
    
    private void paintBlob(Blob<Position2D> blob, Graphics2D g) {
        Position2D pos = blob.getPosition();
        
        int w = cellWidth - borderWidth;
        int h = cellHeight - borderHeight;

        int x = pos.getX() * cellWidth + (borderWidth / 2);
        int y = pos.getY() * cellHeight + (borderHeight / 2);
        
        g.setColor(blob.getParty().getColor());
        g.fillRect(x, y, w, h);
    }
}
