package WorldGen;

import Entity.Entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class MapGenerator {
    public static void createMap(Vector<Vector<Integer>> map) {
        for (int i = 0; i < 15; i++) {
            map.add(new Vector<>());
            for (int j = 0; j < 15; j++) {
                map.get(i).add(0);
            }
        }
    }

    public static void update(Vector<Vector<Integer>> map, Vector<Entity> e) {
        for (Entity en : e) {
            int x = en.getLocation().getX();
            int y = en.getLocation().getY();
            map.get(x).set(y, en.getId());
        }
    }

    public static void drawMap(Vector<Vector<Integer>> map) {
        for (Vector<Integer> row : map) {
            for (Integer integer : row) {
                switch (integer) {
                    case 0:
                        System.out.print(" . ");
                        break;
                    case 1:
                        System.out.print(" P ");
                        break;
                    case 2:
                        System.out.print(" Z ");
                        break;
                    case 10:
                        System.out.print(" # ");
                        break;
                    case 100:
                        System.out.print(" * ");
                        break;
                    default:
                        System.out.print("   ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public static boolean checkAround(Vector<Vector<Integer>> map, Coordinate location) {
        //return true if nothing around, false otherwise
        return location.getX() - 1 == 0 &&
                location.getX() + 1 == 0 &&
                location.getY() - 1 == 0 &&
                location.getY() + 1 == 0;
    }

    public static boolean checkUp(Vector<Vector<Integer>> map, Coordinate location) {return location.getY() - 1 == 0;}
    public static boolean checkDown(Vector<Vector<Integer>> map, Coordinate location) {return location.getY() + 1 == 0;}
    public static boolean checkLeft(Vector<Vector<Integer>> map, Coordinate location) {return location.getX() - 1 == 0;}
    public static boolean checkRight(Vector<Vector<Integer>> map, Coordinate location) {return location.getX() + 1 == 0;}
}
