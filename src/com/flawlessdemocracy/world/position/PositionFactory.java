
package com.flawlessdemocracy.world.position;

public interface PositionFactory<PositionT extends Position> {
    
    PositionT randomPosition();
}
