package com.brightside.simulation;

import com.brightside.entities.Entity;
import com.brightside.entities.creatures.animals.Herbivore;
import com.brightside.entities.creatures.animals.Predator;
import com.brightside.entities.inanimates.Grass;
import com.brightside.entities.inanimates.Rock;
import com.brightside.entities.inanimates.Tree;
import com.brightside.entities.inanimates.Water;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Map {

    protected static Random rnd = new Random();
    protected static final String[] namesEntities = {"Grass", "Rock", "Tree", "Water", "Herbivore", "Predator"};
    protected static HashMap<String, ArrayList<Entity>> dict = new HashMap<>();

    public Map() {
        fillDict();
    }

    /**
     * Данный метод инициализирует наполнение словаря {"сущность":[объекты], ....}
     */
    private static void fillDict() {
        for (String name : namesEntities) {
            ArrayList<Entity> entities = new ArrayList<>();
            switch (name) {
                case "Grass" -> {
                    for (int i = 0; i < rnd.nextInt(10, 15); i++) {
                        entities.add(new Grass());
                }
                    dict.put(name, entities);
            }
                case "Rock" -> {
                    for (int i = 0; i < rnd.nextInt(15, 20); i++) {
                        entities.add(new Rock());
                    }
                    dict.put(name, entities);
                }
                case "Tree" -> {
                    for (int i = 0; i < rnd.nextInt(15, 20); i++) {
                        entities.add(new Tree());
                    }
                    dict.put(name, entities);
                }

                case "Water" -> {
                    for (int i = 0; i < rnd.nextInt(10, 15); i++) {
                        entities.add(new Water());
                    }
                    dict.put(name, entities);
                }

                case "Herbivore" -> {
                    for (int i = 0; i < rnd.nextInt(5, 15); i++) {
                        entities.add(new Herbivore());
                    }
                    dict.put(name, entities);
                }

                case "Predator" -> {
                    for (int i = 0; i < rnd.nextInt(5, 10); i++) {
                        entities.add(new Predator());
                    }
                    dict.put(name, entities);
                }
            }
        }
    }

    public static HashMap<String, ArrayList<Entity>> getDict() {
        return dict;
    }

    public static String[] getNamesEntities() {
        return namesEntities;
    }
    public static void main(String[] args) {
        Map map = new Map();
        System.out.println(dict.entrySet());

//        for (int[] i : coordinatesStillEntities) {
//            System.out.println(i[0] + " " + i[1]);
//        }

//        for (Entity entity : dict.get("Grass")) {
//            System.out.println("Grass " + entity + " " + entity.getX() + " " + entity.getY());
//        }

//        System.out.println(dict.get("Grass"));
    }
}
