
package com.flawlessdemocracy.world.position;

public final class Position2D implements Position {
    
    private final Position2DFactory factory;
    private final int x;
    private final int y;
    
    public Position2D(Position2DFactory factory, int x, int y) {
        this.factory = factory;
        this.x = x;
        this.y = y;
    }

    @Override
    public int asLinear() {
        return factory.getColumns() * getY() + getX();
    }
    
    @Override
    public double distance(Position other) {
        if (!(other instanceof Position2D)) {
            throw new UnsupportedOperationException("No positions other then Position2D are supported.");
        }
        
        Position2D pos = (Position2D) other;
        
        // TODO: define distance
        return -1;
    }
    
    public Position2D relative(int x, int y) {
        return factory.newPosition(getX() + x, getY() + y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
