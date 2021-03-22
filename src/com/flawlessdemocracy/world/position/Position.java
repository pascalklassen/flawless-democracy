
package com.flawlessdemocracy.world.position;

public interface Position {
    
    int asLinear();
    
    double distance(Position other);
}
