
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.Party;
import java.util.List;

public final class RectangleWorld extends World {
    
    private final int rows;
    private final int columns;

    public RectangleWorld(List<Party> parties, int rows, int columns) {
        super(new Position2DFactory(rows, columns), parties);
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void iterate(int n) {
    }

    @Override
    public void randomize() {
        for (int y = 0; y < getRows(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                //blobs.add(new Blob(positions.newPosition(x, y), null));
            }
        }
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
}
