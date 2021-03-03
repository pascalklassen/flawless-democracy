
package com.flawlessdemocracy;

import java.util.Random;

public final class PositionFactory {
    
    private final int gridWidth;
    private final int gridHeight;
    
    public PositionFactory(int gridWidth, int gridHeight) {
        this.gridWidth = gridWidth;
        this.gridHeight = gridHeight;
    }
    
    public Position newPosition(int x, int y) {
        int a = x;
        int b = y;
        
        if (x < 0) a = gridWidth - 1;
        if (y < 0) b = gridHeight - 1;
        if (x >= gridWidth) a = 0;
        if (y >= gridHeight) b = 0;
        
        return new Position(this, a, b);
    }
    
    public Position randomPosition(Random random) {
        return newPosition(random.nextInt(getGridWidth()), random.nextInt(getGridHeight()));
    }
    
    public int getGridWidth() {
        return gridWidth;
    }
    
    public int getGridHeight() {
        return gridHeight;
    }
}
