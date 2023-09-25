package com.brightside.simulation;

import com.brightside.entities.Entity;
import com.brightside.entities.creatures.animals.Herbivore;
import com.brightside.entities.creatures.animals.Predator;
import com.brightside.entities.inanimates.Grass;
import com.brightside.entities.inanimates.Rock;
import com.brightside.entities.inanimates.Tree;
import com.brightside.entities.inanimates.Water;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс, который совершает действия над миром
 */
public class Actions {
    protected static Random RND = new Random();
    protected static final String[] namesEntities = Map.getNamesEntities();

    /**
     * Данный метод расставляет первоначально объекты на карте / инициализирует наполнение словаря {"сущность":[объекты], ....}
     */
    public void initialActions() {
        for (String name : namesEntities) {
            ArrayList<Entity> entities = new ArrayList<>();
            switch (name) {
                case "Grass" -> {
                    for (int i = 0; i < RND.nextInt(10, 15); i++) {
                        Grass grass;
                        do {
                            grass = new Grass();
                        } while (isUsedCoordinates(grass));
                        entities.add(grass);
                        Map.addCoordinates(grass.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }
                case "Rock" -> {
                    for (int i = 0; i < RND.nextInt(15, 20); i++) {
                        Rock rock;
                        do {
                            rock = new Rock();
                        } while (isUsedCoordinates(rock));
                        entities.add(rock);
                        Map.addCoordinates(rock.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }
                case "Tree" -> {
                    for (int i = 0; i < RND.nextInt(15, 20); i++) {
                        Tree tree;
                        do {
                            tree = new Tree();
                        } while (isUsedCoordinates(tree));
                        entities.add(tree);
                        Map.addCoordinates(tree.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }

                case "Water" -> {
                    for (int i = 0; i < RND.nextInt(10, 15); i++) {
                        Water water;
                        do {
                            water = new Water();
                        } while (isUsedCoordinates(water));
                        entities.add(water);
                        Map.addCoordinates(water.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }

                case "Herbivore" -> {
                    for (int i = 0; i < RND.nextInt(5, 15); i++) {
                        Herbivore herbivore;
                        do {
                            herbivore = new Herbivore();
                        } while (isUsedCoordinates(herbivore));
                        entities.add(herbivore);
                        Map.addCoordinates(herbivore.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }

                case "Predator" -> {
                    for (int i = 0; i < RND.nextInt(5, 10); i++) {
                        Predator predator;
                        do {
                            predator = new Predator();
                        } while (isUsedCoordinates(predator));
                        entities.add(predator);
                        Map.addCoordinates(predator.getCoordinates());
                    }
                    Map.addToDict(name, entities);
                }
            }
        }
    }

    /**
     * Данный метод проверяет, занята ли координата у новосозданного объекта на карте или нет
     *
     * @param entity создаваемый объект, который появляется на карте
     * @return true (used) or false (not used)
     */
    private static boolean isUsedCoordinates(Entity entity) {
        ArrayList<int[]> coordinates = Map.getCoordinates();
        for (int[] coordinate : coordinates)
            if (coordinate[0] == entity.getX() && coordinate[1] == entity.getY()) {
                return true;
            } else {
                return false;
            }
        return false;
    }

}
