
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.world.position.Position2DFactory;
import com.flawlessdemocracy.Party;
import java.awt.Color;
import java.util.List;

public final class RectangleWorld extends World<Position2DFactory> {
    
    private final int rows;
    private final int columns;

    public RectangleWorld(List<Party> parties, int rows, int columns) {
        super(new Position2DFactory(rows, columns), parties);
        
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void iterate(int n) {
        Blob left = getRandomBlob();
        Blob right = getNeighborsAt(left.getPosition()).get(random.nextInt(8));

        if (!left.getParty().equals(right.getParty())) {
            if (random.nextBoolean()) {
                right.setParty(left.getParty());
            }
        }
    }

    @Override
    public void randomize() {
        for (int y = 0; y < getRows(); y++) {
            for (int x = 0; x < getColumns(); x++) {
                blobs.add(
                        new Blob<>(
                                positions.newPosition(x, y),
                                random.nextBoolean() ? 
                                        new Party("Democrats", Color.BLUE) :
                                        new Party("Republicans", Color.RED)
                        )
                );
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
