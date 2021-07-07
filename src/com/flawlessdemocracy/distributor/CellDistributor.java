
package com.flawlessdemocracy.distributor;

import com.flawlessdemocracy.Cell;
import com.flawlessdemocracy.world.position.PositionFactory;
import java.util.List;

public interface CellDistributor<PositionF extends PositionFactory> {
    
    void distribute(PositionF factory, List<Cell> cells);
}
