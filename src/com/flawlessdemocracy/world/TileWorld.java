
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.Cell;
import com.flawlessdemocracy.world.position.Position2DFactory;
import com.flawlessdemocracy.Party;
import com.flawlessdemocracy.distributor.CellDistributor;
import com.flawlessdemocracy.world.position.Position2D;
import java.util.List;
import java.util.stream.Collectors;

public final class TileWorld extends World<Position2DFactory, Position2D> {
    
    private final int rows;
    private final int columns;

    public TileWorld(List<Party> parties, int rows, int columns, CellDistributor distributor, boolean wraparound) {
        super(
            new Position2DFactory(rows, columns, wraparound),
            distributor,
            parties
        );
        
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void iterate(int n) {
        for (int i = 0; i < n; i++) {
            Cell<Position2D> left = getRandomCell();
        
            List<Cell> neighbors = getNextTo(left.getPosition());
            Cell<Position2D> right = neighbors.get(random.nextInt(neighbors.size()));

            if (!left.getColor().equals(right.getColor())) {
                if (random.nextBoolean()) {
                    right.setColor(left.getColor());
                }
            }
        }
    }
    
    @Override
    public List<Cell> getNextTo(Position2D position) {
        return cells.stream()
                .filter(cell -> (cell.getPosition().distance(position) == 1))
                .collect(Collectors.toList());
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
}
