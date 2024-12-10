import Entity.*;
import WorldGen.Coordinate;
import WorldGen.MapGenerator;
import functions.KeyHandler;

import java.util.ArrayList;
import java.util.Map;
import java.awt.*;
import java.util.Random;
import java.util.Vector;

public class Game implements Runnable{

    Thread gameThread;
    public final int FPS = 1;
    Vector<Vector<Integer>> map = new Vector<>();
    Vector<Entity> entityList = new Vector<>();
    private final Random seed = new Random();
    KeyHandler keyH;

    public static void main(String[] args) {
        Game g = new Game();
        g.startGame();
    }

    public void startGame() {
        MapGenerator.createMap(map);
        Player p = new Player(20, 1, new Coordinate(7, 7));
        this.entityList.add(p);
        startGameThread();
        //TODO implements key listeners
    }


    @Override
    public void run() {
        // Boucle du jeu: s'actualise 1 fois par secondes (1fps)
        double drawInterval = (double) 1000000000 /FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                delta--;
            }
        }
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
        System.out.println("Game thread has started");
    }

    public void update() {
        MapGenerator.update(map, entityList);
        //update toutes les entites
        for (Entity en : this.entityList) {
            en.update();
            if (en.getHealth() <= 0)
                if (!(en instanceof Item)) {
                    entityList.remove(en);
                    //System.out.println(en.getName() + " died");
                }
            // damage entity when next to zombies
            if (en.getId() == 2 && !MapGenerator.checkAround(map, en.getLocation())) {
                if (MapGenerator.checkUp(map, en.getLocation())){

                }

            }
        }



        // Spawn de zombies et de pommes en utilisant l'aleatoire
        int random = this.seed.nextInt(16);
        if (random == 7) {
            Zombie z = new Zombie(20, 20, 1, new Coordinate(this.seed.nextInt(15), this.seed.nextInt(15)));
            this.entityList.add(z);
        }
        else if (random == 15) {
            Apple a = new Apple(new Coordinate(this.seed.nextInt(15), this.seed.nextInt(15)));
            this.entityList.add(a);
        }

        //Afficher la map dans la console

        System.out.println();
        MapGenerator.drawMap(map);


    }
}