package com.brightside.simulation;

import com.brightside.entities.Entity;
import com.brightside.entities.creatures.Creature;
import com.brightside.entities.creatures.animals.Herbivore;
import com.brightside.entities.creatures.animals.Predator;
import com.brightside.entities.inanimates.Grass;
import com.brightside.entities.inanimates.Rock;
import com.brightside.entities.inanimates.Tree;
import com.brightside.entities.inanimates.Water;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс, который совершает действия над миром
 */
public class Actions {
    protected static Random RND = new Random();
    protected static final String[] ENTITIES_NAMES = Map.getEntitiesNames();

    public Actions(Map map) {
        initialActions(map);
    }

    /**
     * Данный метод расставляет первоначально объекты на карте / инициализирует наполнение словаря {"сущность":[объекты], ....}
     */
    public void initialActions(Map map) { // TODO: можно ли реализовать полиморфизм?
        for (String name : ENTITIES_NAMES) {
            ArrayList<Entity> entities = new ArrayList<>();
            switch (name) {
                case "Grass" -> {
                    for (int i = 0; i < RND.nextInt(30, 50); i++) {
                        Grass grass;
                        do {
                            grass = new Grass();
                        } while (isUsedCoordinates(grass, map));
                        entities.add(grass);
                        map.addCoordinates(grass.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }
                case "Rock" -> {
                    for (int i = 0; i < RND.nextInt(15, 30); i++) {
                        Rock rock;
                        do {
                            rock = new Rock();
                        } while (isUsedCoordinates(rock, map));
                        entities.add(rock);
                        map.addCoordinates(rock.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }
                case "Tree" -> {
                    for (int i = 0; i < RND.nextInt(30, 50); i++) {
                        Tree tree;
                        do {
                            tree = new Tree();
                        } while (isUsedCoordinates(tree, map));
                        entities.add(tree);
                        map.addCoordinates(tree.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }

                case "Water" -> {
                    for (int i = 0; i < RND.nextInt(20, 30); i++) {
                        Water water;
                        do {
                            water = new Water();
                        } while (isUsedCoordinates(water, map));
                        entities.add(water);
                        map.addCoordinates(water.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }

                case "Herbivore" -> {
                    for (int i = 0; i < RND.nextInt(5, 15); i++) {
                        Herbivore herbivore;
                        do {
                            herbivore = new Herbivore();
                        } while (isUsedCoordinates(herbivore, map));
                        entities.add(herbivore);
                        map.addCoordinates(herbivore.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }

                case "Predator" -> {
                    for (int i = 0; i < RND.nextInt(5, 10); i++) {
                        Predator predator;
                        do {
                            predator = new Predator();
                        } while (isUsedCoordinates(predator, map));
                        entities.add(predator);
                        map.addCoordinates(predator.getCoordinates());
                    }
                    map.addToMap(name, entities);
                }
            }
        }
    }

    public void nextTurn() { // TODO: add
    }

    /**
     * Осуществляет действие каждого одушевленного объекта
     *
     * @param map словарь с объектами
     */
    public void makeMove(Map map) { // TODO: однозначно не хватает полиморфизма
        String[] mapKeys = map.getMap().keySet().toArray(new String[0]);

        for (String name : mapKeys) {
            switch (name) {
                case "Herbivore" -> { // TODO: заменить на Creature? и вызывать его методы?
                    for (Entity entity : map.getMap().get("Herbivore")) {
                        Herbivore herbivore = (Herbivore) entity;
                        do {
                            deleteOldCoordinates(herbivore.getCoordinates(), map);
                            herbivore.makeMove();
                        } while (isUsedCoordinates(herbivore, map));
                        map.addCoordinates(herbivore.getCoordinates());
                    }
                }
                case "Predator" -> {
                    for (Entity entity : map.getMap().get("Predator")) {
                        Predator predator = (Predator) entity;
                        do {
                            deleteOldCoordinates(predator.getCoordinates(), map);
                            predator.makeMove();
                        } while (isUsedCoordinates(predator, map));
                        map.addCoordinates(predator.getCoordinates());
                    }
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
    private static boolean isUsedCoordinates(Entity entity, Map map) {
        List<int[]> coordinates = map.getCoordinates();
        for (int[] coordinate : coordinates) {
            if (coordinate[0] == entity.getX() && coordinate[1] == entity.getY()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод удаляет старые координаты из массива Map.coordinates. Т.е. обновляет все координаты объектов на карте
     * @param ints целочисленный массив новых координат
     * @param map акутальная карта
     */
    private static void deleteOldCoordinates(int[] ints, Map map) {
        for (int[] coordinate : map.getCoordinates()) {
            if (ints[0] == coordinate[0] && ints[1] == coordinate[1]) {
                map.deleteCoordinates(coordinate);
                System.out.println("Yes, deleting");
                System.out.println(map.getCoordinates());
                return;
            }
        }
    }

}
