
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.Party;
import java.util.List;

public interface World {
    
    default void iterate() {
        iterate(1);
    }
    
    void iterate(int n);
    
    void randomize();
    
    List<Party> getParties();
    
    Blob getBlobAt(Position position);
    
    List<Blob> getBlobs();
    
    List<Blob> getNeighborsAt(Position position);
}
