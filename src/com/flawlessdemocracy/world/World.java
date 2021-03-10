
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.world.position.Position;
import com.flawlessdemocracy.world.position.PositionFactory;
import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.Party;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class World<PositionF extends PositionFactory> {
    
    protected final PositionF positions;
    
    protected final List<Party> parties;
    protected final List<Blob> blobs;
    
    protected final Random random;
    
    public World(PositionF positions, List<Party> parties) {
        this.positions = positions;
        this.parties = parties;
        this.blobs = new ArrayList();
        this.random = new Random(System.currentTimeMillis());
    }
    
    public void iterate() {
        iterate(1);
    }
    
    public abstract void iterate(int n);
    
    public abstract void randomize();
    
    public List<Party> getParties() {
        return Collections.unmodifiableList(parties);
    }
    
    public Blob getBlobAt(Position position) {
        return blobs.get(position.asLinear());
    }
    
    public Blob getRandomBlob() {
        return blobs.get(positions.randomPosition().asLinear());
    }
    
    public List<Blob> getBlobs() {
        return Collections.unmodifiableList(blobs);
    }
    
    public List<Blob> getNeighborsAt(Position position) {
        List<Blob> neighbors = new ArrayList();
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                
                neighbors.add(getBlobAt(position.relative(j, i)));
            }
        }
        
        System.out.printf("n %s", neighbors.size());
        return neighbors;
    }
}
