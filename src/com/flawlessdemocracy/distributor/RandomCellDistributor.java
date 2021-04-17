
package com.flawlessdemocracy.distributor;

import com.flawlessdemocracy.Cell;
import com.flawlessdemocracy.Party;
import com.flawlessdemocracy.world.position.Position2DFactory;
import java.util.List;
import java.util.Random;

public final class RandomCellDistributor implements CellDistributor<Position2DFactory> {
    
    private final int rows;
    private final int columns;
    private final List<Party> parties;
    private final Random random;

    public RandomCellDistributor(int rows, int columns, List<Party> parties) {
        this.random = new Random(System.currentTimeMillis());
        this.rows = rows;
        this.columns = columns;
        this.parties = parties;
    }

    @Override
    public void distribute(Position2DFactory factory, List<Cell> cells) {
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                cells.add(new Cell<>(
                                factory.newPosition(x, y),
                                parties.get(random.nextInt(parties.size()))
                                        .getColor()
                        )
                );
            }
        }
    }
}
