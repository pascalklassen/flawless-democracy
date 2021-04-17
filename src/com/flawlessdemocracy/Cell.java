
package com.flawlessdemocracy;

import com.flawlessdemocracy.world.position.Position;
import java.awt.Color;

public final class Cell<PositionT extends Position> {
    
    private final PositionT position;
    private Color color;
    
    public Cell(PositionT position, Color color) {
        this.position = position;
        this.color = color;
    }
    
    public PositionT getPosition() {
        return position;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
}
