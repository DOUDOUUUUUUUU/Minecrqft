package Entity;

import WorldGen.Coordinate;

public class Item extends Entity{

    public Item(int id, Coordinate location) {
        super(-1, -1, 0, location, id);
    }

    @Override
    public void update() {
        //NULL
    }
}
