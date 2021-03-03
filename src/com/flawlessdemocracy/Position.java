
package com.flawlessdemocracy;

public final class Position {
    
    private final PositionFactory factory;
    private final int x;
    private final int y;
    
    public Position(PositionFactory factory, int x, int y) {
        this.factory = factory;
        this.x = x;
        this.y = y;
    }
    
    public Position getLeft() {
        return factory.newPosition(x - 1, y);
    }
    
    public Position getRight() {
        return factory.newPosition(x + 1, y);
    }
    
    public Position getTop() {
        return factory.newPosition(x, y + 1);
    }
    
    public Position getBottom() {
        return factory.newPosition(x, y - 1);
    }
    
    public int asLinear() {
        return factory.getGridWidth() * getY() + getX();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (getClass() != obj.getClass()) return false;
        
        Position position = (Position) obj;
        
        return (x == position.x && y == position.y) &&
                (factory.equals(position.factory));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.y;
        hash = 31 * hash + factory.hashCode();
        return hash;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
