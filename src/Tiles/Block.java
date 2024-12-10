package Tiles;

import java.util.ArrayList;

public class Block {
    private final int breakingSpeed;
    private final int blastResistance;
    private final ArrayList<String> tags;
    private final ArrayList<String> mineable;
    public final String NAME;
    public final int BLOCKID;

    public Block(int breakingSpeed, int blastResistance, ArrayList<String> tags, String name, int id, ArrayList<String> mineable) {
        this.breakingSpeed = breakingSpeed;
        this.blastResistance = blastResistance;
        this.tags = tags;
        this.NAME = name;
        this.BLOCKID = id;
        this.mineable = mineable;
    }

    public int getBreakingSpeed() {
        return breakingSpeed;
    }

    public int getBlastResistance() {
        return blastResistance;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
}
