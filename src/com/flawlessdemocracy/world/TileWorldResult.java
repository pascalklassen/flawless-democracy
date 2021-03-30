
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.Party;
import java.util.List;
import java.util.stream.Collectors;

public final class TileWorldResult {
    
    private final TileWorld world;
    
    public TileWorldResult(TileWorld world) {
        this.world = world;
    }
    
    public boolean isDone() {
        return world.getBlobs()
                .stream()
                .map(Blob::getParty)
                .allMatch(party -> party.equals(world.getBlobs().get(0).getParty()));
    }
    
    public List<Integer> getPercentages() {
        return world.getParties()
                .stream()
                .map(this::getPercentage)
                .collect(Collectors.toList());
    }
    
    private int getPercentage(Party party) {
        return ((int) world.getBlobs()
                .stream()
                .map(Blob::getParty)
                .filter(p -> party.equals(p))
                .count() / world.getBlobs().size()) * 100;
    }
}
