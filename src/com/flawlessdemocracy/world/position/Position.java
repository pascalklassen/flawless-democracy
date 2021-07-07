
package com.flawlessdemocracy.world.position;

public interface Position<PositionT extends Position> {
    
    int asLinear();
    
    double distance(PositionT other);
}
