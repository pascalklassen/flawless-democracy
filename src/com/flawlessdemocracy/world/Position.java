
package com.flawlessdemocracy.world;

public interface Position {
    
    int asLinear();
    
    Position relative(int x, int y);
}
