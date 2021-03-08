
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.world.position.Position2D;
import java.awt.Graphics;
import java.awt.Graphics2D;

public final class RectangleWorldCanvas extends WorldCanvas<RectangleWorld> {
    
    private static final int CELL_WIDTH = 20;
    private static final int CELL_HEIGHT = 20;
    
    private static final int CELL_BORDER_WIDTH = 2;
    private static final int CELL_BORDER_HEIGHT = 2;
    
    private final int rows;
    private final int columns;
    
    public RectangleWorldCanvas(RectangleWorld world) {
        super(world);
        this.rows = world.getRows();
        this.columns = world.getColumns();
        
        setSize(CELL_WIDTH * columns, CELL_HEIGHT * rows);
        
        world.randomize();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        System.out.printf("time %s ", System.currentTimeMillis());
        
        world.getBlobs().forEach(blob -> {
            paintBlob(blob, (Graphics2D) g);
        });
    }
    
    private void paintBlob(Blob<Position2D> blob, Graphics2D g) {
        Position2D pos = blob.getPosition();
        
        int w = CELL_WIDTH - CELL_BORDER_WIDTH;
        int h = CELL_HEIGHT - CELL_BORDER_HEIGHT;

        int x = pos.getX() * CELL_WIDTH + (CELL_BORDER_WIDTH / 2);
        int y = pos.getY() * CELL_HEIGHT + (CELL_BORDER_HEIGHT / 2);
        
        g.setColor(blob.getParty().getColor());
        g.fillRect(x, y, w, h);
    }

    
}
