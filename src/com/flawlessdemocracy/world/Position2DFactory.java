
package com.flawlessdemocracy.world;

import java.util.Random;

public final class Position2DFactory implements PositionFactory {
    
    private final int rows;
    private final int columns;
    
    private final Random random;
    
    public Position2DFactory(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Position2D newPosition(int x, int y) {
        int a = x;
        int b = y;
        
        if (x < 0) a = getColumns() - 1;
        if (y < 0) b = getRows() - 1;
        if (x >= getColumns()) a = 0;
        if (y >= getRows()) b = 0;
        
        return new Position2D(this, a, b);
    }

    @Override
    public Position2D randomPosition() {
        return newPosition(getColumns(), getRows());
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
}
