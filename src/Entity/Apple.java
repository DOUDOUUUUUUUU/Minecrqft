package Entity;

import WorldGen.Coordinate;

public class Apple extends Item{
    public Apple(Coordinate location) {
        super(100, location);
    }

    public void eat(Player p) {
        if (p.getHealth() + 2 > p.getMaxHealth())
            p.setHealth(20);
        else
            p.setHealth(p.getHealth() + 2);
    }
}
