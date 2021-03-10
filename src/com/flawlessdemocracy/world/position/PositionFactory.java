
package com.flawlessdemocracy.world.position;

public interface PositionFactory {
   
    Position newPosition(int x, int y);
    
    Position randomPosition();
}
