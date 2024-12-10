package functions;

import Entity.Item;

import java.util.ArrayList;

public class Recipe {
    private boolean isUnlocked;
    private final ArrayList<Item> materialList;
    private Item output;
    private final boolean isShapeless;
    public final int RECIPEID;

    public Recipe(boolean isUnlocked, ArrayList<Item> materialList, Item output, boolean isShapeless, int id) {
        this.isUnlocked = isUnlocked;
        this.materialList = materialList;
        this.output = output;
        this.isShapeless = isShapeless;
        this.RECIPEID = id;
    }

    public boolean isShapeless() {
        return isShapeless;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public ArrayList<Item> getMaterialList() {
        return materialList;
    }

    public Item getOutput() {
        return output;
    }

    public void setUnlocked(boolean b) {
        this.isUnlocked = b;
    }
}
