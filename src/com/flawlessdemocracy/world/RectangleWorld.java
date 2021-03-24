
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.world.position.Position2DFactory;
import com.flawlessdemocracy.Party;
import com.flawlessdemocracy.world.position.Position2D;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public final class RectangleWorld extends World<Position2DFactory, Position2D> {
    
    private final int rows;
    private final int columns;

    public RectangleWorld(List<Party> parties, int rows, int columns) {
        super(new Position2DFactory(rows, columns), parties);
        
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void iterate(int n) {
        for (int i = 0; i < n; i++) {
            Blob<Position2D> left = getRandomBlob();
        
            List<Blob> neighbors = getNeighborsAt(left.getPosition());
            Blob<Position2D> right = neighbors.get(random.nextInt(neighbors.size()));

            if (!left.getParty().equals(right.getParty())) {
                if (random.nextBoolean()) {
                    right.setParty(left.getParty());
                }
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
    
    @Override
    public List<Blob> getNeighborsAt(Position2D position) {
        return Arrays.asList(
                getBlobAt(position.relative(0, 1)),
                getBlobAt(position.relative(1, 0)),
                getBlobAt(position.relative(0, -1)),
                getBlobAt(position.relative(-1, 0))
        );
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
}
