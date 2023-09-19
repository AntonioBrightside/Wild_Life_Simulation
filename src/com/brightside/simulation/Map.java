package com.brightside.simulation;

import com.brightside.entities.Entity;
import com.brightside.entities.inanimates.Grass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Map {

    protected static Random rnd = new Random();
    protected static final String[] namesEntities = {"Grass", "Rock", "Tree", "Water", "Herbivore", "Predator"};
    protected static String[] namesInanimates = {"Rock", "Tree", "Water"};
    protected static String[] namesFeed = {"Grass"};
    protected static String[] namesCreatures = {"Herbivore", "Predator"};
    protected static ArrayList<int[]> coordinatesStillEntities = new ArrayList<>();
    protected static ArrayList<int[]> coordinatesHerbivore = new ArrayList<>();
    protected static ArrayList<int[]> coordinatesPredator = new ArrayList<>();
    protected static ArrayList<int[]> coordinatesFeed = new ArrayList<>();
    protected static HashMap<String, ArrayList<Entity>> dict = new HashMap<>();

    public Map() {
        ArrayList<Entity> entities = new ArrayList<>();
        for (int i = 0; i < rnd.nextInt(5, 15); i++) {
            Grass grass = new Grass();
            entities.add(grass);
            int[] tempCoordinates = {grass.getX(), grass.getY()};
            coordinatesStillEntities.add(tempCoordinates);
        }
        dict.put("Grass", entities);
    }

    private static void fillDict() {
        ArrayList<Entity> entities = new ArrayList<>();
        for (String name : namesEntities) {
            for (int i = 0; i < rnd.nextInt(5, 15); i++) {
                
            }
        }
    }

    public static HashMap<String, ArrayList<Entity>> getDict() {
        return dict;
    }

    public static void main(String[] args) {
        Map map = new Map();
        System.out.println(dict.entrySet());

//        for (int[] i : coordinatesStillEntities) {
//            System.out.println(i[0] + " " + i[1]);
//        }

        for (Entity entity : dict.get("Grass")) {
            System.out.println("Grass " + entity + " " + entity.getX() + " " + entity.getY());
        }

//        System.out.println(dict.get("Grass"));
    }
}
