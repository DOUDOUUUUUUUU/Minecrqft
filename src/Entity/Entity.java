package Entity;

import WorldGen.Coordinate;

import java.util.Random;

public abstract class Entity {

    private String name;
    private final int maxHealth;
    private int health;
    private int baseDamage;
    private Coordinate location;
    private int id;


    public Entity(int maxHealth, int health, int baseDamage, Coordinate location, int id) {
        this.maxHealth = maxHealth;
        this.health = health;
        this.baseDamage = baseDamage;
        this.location = location;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getHealth() {
        return health;
    }
    public int getBaseDamage() {
        return baseDamage;
    }
    public Coordinate getLocation() {
        return location;
    }
    public void setLocation(Coordinate location) {
        this.location = location;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public abstract void update();
}
