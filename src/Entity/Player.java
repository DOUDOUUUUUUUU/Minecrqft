package Entity;

import WorldGen.Coordinate;
import functions.KeyHandler;
import functions.Recipe;

import java.util.ArrayList;


public class Player extends Entity {
    KeyHandler keyH;

    private ArrayList<String> inventory;
    private ArrayList<Recipe> knowledgeBook;
    public final boolean isPlayer = true;

    public Player(int maxHealth, int baseDamage, Coordinate location) {
        super(maxHealth, maxHealth, baseDamage , location, 1);
        this.keyH = new KeyHandler();
    }

    public void update() {
        if (keyH.upPressed) {
            setLocation(new Coordinate(getLocation().getX(), getLocation().getY() - 1));
            keyH.upPressed = false;
        }
        if (keyH.downPressed) {
            setLocation(new Coordinate(getLocation().getX(), getLocation().getY() + 1));
            keyH.downPressed = false;
        }
        if (keyH.leftPressed) {
            setLocation(new Coordinate(getLocation().getX() - 1, getLocation().getY()));
            keyH.leftPressed = false;
        }
        if (keyH.rightPressed) {
            setLocation(new Coordinate(getLocation().getX() + 1, getLocation().getY()));
            keyH.rightPressed = false;
        }
    }



}

