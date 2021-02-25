
package com.flawlessdemocracy;

import java.awt.Color;
import java.util.Objects;

public final class Party {
    
    private final String name;
    private final Color color;
    
    public Party(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (getClass() != obj.getClass()) return false;
        
        Party party = (Party) obj;
        
        return Objects.equals(name, party.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.color);
        return hash;
    }

    public String getName() {
        return name;
    }
    
    public Color getColor() {
        return color;
    }
}
