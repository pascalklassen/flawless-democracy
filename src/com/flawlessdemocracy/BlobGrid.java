
package com.flawlessdemocracy;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class BlobGrid {
    
    public static final int MAX_ITERATIONS = 10_000_000;
    public static final int MIN_ITERATIONS = 1;
    
    public static final int MAX_GRID_WIDTH = 200;
    public static final int MIN_GRID_WIDTH = 4;
    
    public static final int MAX_GRID_HEIGHT = 200;
    public static final int MIN_GRID_HEIGHT = 4;
    
    private static final Party NO_PARTY = new Party("No Party", Color.LIGHT_GRAY);
    
    private int width;
    private int height;
    private final List<Party> parties;
    private final Random random;
    
    private PositionFactory positions;
    private final List<Blob> blobs;
    
    public BlobGrid(int width, int height, List<Party> parties, Random random) {
        this.width = width;
        this.height = height;
        this.parties = parties;
        this.random = random;
        this.blobs = new ArrayList();
    }
    
    public void setup() {
        setup(getWidth(), getHeight());
    }
    
    public void setup(int width, int height) {
        this.width = width;
        this.height = height;
        
        positions = new PositionFactory(getWidth(), getHeight());
        
        blobs.clear();
        for (int y = 0; y < getHeight(); y++) {
            for (int x = 0; x < getWidth(); x++) {
                Blob blob = new Blob(positions.newPosition(x, y), NO_PARTY);
                blobs.add(blob);
            }
        }
    }
    
    public void iterate(int iterations) {
        for (int i = 0; i < iterations; i++) {
            Position position = positions.randomPosition(random);
            
            Blob left = getBlobAt(position);
            List<Blob> n = getNeighborsAt(position);
            
            System.out.printf("=== Neighbors from (%s, %s) ===\n", position.getX(), position.getY());
            n.forEach(System.out::println);
            
            System.out.println("=== The choosen one ===");
            Blob right = getNeighborsAt(position).get(random.nextInt(4));
            System.out.println(right);
            
            if (!left.getParty().equals(right.getParty())) {
                if (random.nextInt(2) == 0) {
                    System.out.println("=== He was convinced !! ===");
                    right.setParty(left.getParty());
                }
            }
        }
    }
    
    public void randomize() {
        getBlobs().forEach(blob -> 
                blob.setParty(
                        getParties().get(random.nextInt(getParties().size()))
                )
        );
    }
    
    public void addParty(Party party) {
        parties.add(party);
    }
    
    public Blob getBlobAt(Position position) {
        return blobs.get(position.asLinear());
    }
    
    public List<Blob> getNeighborsAt(Position position) {
        return Arrays.asList(
                getBlobAt(position.getTop()),
                getBlobAt(position.getRight()),
                getBlobAt(position.getBottom()),
                getBlobAt(position.getLeft())
        );
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public List<Party> getParties() {
        return Collections.unmodifiableList(parties);
    }
    
    public List<Blob> getBlobs() {
        return Collections.unmodifiableList(blobs);
    }
}
