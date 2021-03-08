
package com.flawlessdemocracy.world.position;

public interface Position {
    
    int asLinear();
    
    Position relative(int x, int y);
}
