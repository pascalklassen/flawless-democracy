
package com.flawlessdemocracy.world.position;

public final class Position2D implements Position<Position2D> {
    
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
    public double distance(Position2D other) {
        // TODO consider wraparound mechanic
        return Math.abs(getX() - other.getX()) + Math.abs(getY() - other.getY());
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
