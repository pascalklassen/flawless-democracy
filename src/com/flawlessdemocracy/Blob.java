
package com.flawlessdemocracy;

import com.flawlessdemocracy.world.position.Position;

public final class Blob<PositionT extends Position> {
    
    private final PositionT position;
    private Party party;
    
    public Blob(PositionT position, Party party) {
        this.position = position;
        this.party = party;
    }
    
    public PositionT getPosition() {
        return position;
    }
    
    public Party getParty() {
        return party;
    }
    
    public void setParty(Party party) {
        this.party = party;
    }
}
