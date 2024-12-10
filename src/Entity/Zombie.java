package Entity;

import WorldGen.Coordinate;
import WorldGen.MapGenerator;

public class Zombie extends Entity{


    public Zombie(int maxHealth, int health, int baseDamage, Coordinate location) {
        super(maxHealth, health, baseDamage, location, 2);
    }

    @Override
    public void update() {
    }
}
