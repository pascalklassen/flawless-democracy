
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Blob;
import com.flawlessdemocracy.world.position.Position2DFactory;
import com.flawlessdemocracy.Party;
import com.flawlessdemocracy.world.position.Position2D;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class TileWorld extends World<Position2DFactory, Position2D> {
    
    private final int rows;
    private final int columns;

    public TileWorld(List<Party> parties, int rows, int columns) {
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
                                getParties().get(random.nextInt(getParties().size()))
                        )
                );
            }
        }
    }
    
    @Override
    public List<Blob> getNeighborsAt(Position2D position) {
        return blobs.stream()
                .filter(blob -> (blob.getPosition().distance(position) == 1))
                .collect(Collectors.toList());
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
}
