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
    protected static ArrayList<int[]> coordinates = new ArrayList<>();

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
                        Grass grass;
                        do {
                            grass = new Grass();
                        } while (isUsedCoordinates(grass));
                        entities.add(grass);
                        coordinates.add(grass.getCoordinates());
                    }
                    dict.put(name, entities);
            }
                case "Rock" -> {
                    for (int i = 0; i < rnd.nextInt(15, 20); i++) {
                        Rock rock;
                        do {
                            rock = new Rock();
                        } while (isUsedCoordinates(rock));
                        entities.add(rock);
                        coordinates.add(rock.getCoordinates());
                    }
                    dict.put(name, entities);
                }
                case "Tree" -> {
                    for (int i = 0; i < rnd.nextInt(15, 20); i++) {
                        Tree tree;
                        do {
                            tree = new Tree();
                        } while (isUsedCoordinates(tree));
                        entities.add(tree);
                        coordinates.add(tree.getCoordinates());
                    }
                    dict.put(name, entities);
                }

                case "Water" -> {
                    for (int i = 0; i < rnd.nextInt(10, 15); i++) {
                        Water water;
                        do {
                            water = new Water();
                        } while (isUsedCoordinates(water));
                        entities.add(water);
                        coordinates.add(water.getCoordinates());
                    }
                    dict.put(name, entities);
                }

                case "Herbivore" -> {
                    for (int i = 0; i < rnd.nextInt(5, 15); i++) {
                        Herbivore herbivore;
                        do {
                            herbivore = new Herbivore();
                        } while (isUsedCoordinates(herbivore));
                        entities.add(herbivore);
                        coordinates.add(herbivore.getCoordinates());
                    }
                    dict.put(name, entities);
                }

                case "Predator" -> {
                    for (int i = 0; i < rnd.nextInt(5, 10); i++) {
                        Predator predator;
                        do {
                            predator = new Predator();
                        } while (isUsedCoordinates(predator));
                        entities.add(predator);
                        coordinates.add(predator.getCoordinates());
                    }
                    dict.put(name, entities);
                }
            }
        }
    }

    /**
     * Данный метод проверяет, занята ли координата у новосозданного объекта на карте или нет
     * @param entity создаваемый объект, который появляется на карте
     * @return true (used) or false (not used)
     */
    private static boolean isUsedCoordinates(Entity entity) {
        for(int[] coordinate: coordinates)
            if (coordinate[0] == entity.getX() && coordinate[1] == entity.getY()) {
                return true;
            } else {
                return false;
            }
        return false;
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

//        for (int[] i : coordinates) {
//            System.out.println(i[0] + " " + i[1]);
//        }

//        for (int[] i : coordinatesStillEntities) {
//            System.out.println(i[0] + " " + i[1]);
//        }

//        for (Entity entity : dict.get("Grass")) {
//            System.out.println("Grass " + entity + " " + entity.getX() + " " + entity.getY());
//        }

//        System.out.println(dict.get("Grass"));
    }
}
