
package com.flawlessdemocracy.world;

public interface PositionFactory {
   
    Position newPosition(int x, int y);
    
    Position randomPosition();
}
