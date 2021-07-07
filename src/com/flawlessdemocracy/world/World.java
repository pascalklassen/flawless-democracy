
package com.flawlessdemocracy.world;

import com.flawlessdemocracy.world.position.Position;
import com.flawlessdemocracy.world.position.PositionFactory;
import com.flawlessdemocracy.Cell;
import com.flawlessdemocracy.Party;
import com.flawlessdemocracy.distributor.CellDistributor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class World<PositionF extends PositionFactory, PositionT extends Position> {
    
    protected final PositionF positionFactory;
    protected final CellDistributor distributor;
    
    protected final List<Party> parties;
    protected final List<Cell> cells;
    
    protected final Random random;
    
    public World(PositionF positions, CellDistributor<PositionF> distributor, List<Party> parties) {
        this.positionFactory = positions;
        this.distributor = distributor;
        this.parties = parties;
        this.cells = new ArrayList();
        this.random = new Random(System.currentTimeMillis());
    }
    
    public void iterate() {
        iterate(1);
    }
    
    public void setup() {
        distributor.distribute(positionFactory, cells);
    }
    
    public abstract void iterate(int n);
    
    
    public List<Party> getParties() {
        return Collections.unmodifiableList(parties);
    }
    
    public Cell getCellAt(PositionT position) {
        return cells.get(position.asLinear());
    }
    
    public Cell getRandomCell() {
        return cells.get(positionFactory.randomPosition().asLinear());
    }
    
    public List<Cell> getCells() {
        return Collections.unmodifiableList(cells);
    }
    
    public List<Cell> getNextTo(PositionT position) {
        return Collections.EMPTY_LIST;
    }
}
