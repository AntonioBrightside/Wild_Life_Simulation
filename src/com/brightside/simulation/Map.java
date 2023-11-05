package com.brightside.simulation;

import com.brightside.entities.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Класс-хранитель данных.
 */
public class Map {

    private static final String[] NAMES_ENTITIES = {"Grass", "Rock", "Tree", "Water", "Herbivore", "Predator"};
    private HashMap<String, ArrayList<Entity>> map = new HashMap<>();
    private List<int[]> coordinates = new ArrayList<>(); // TODO: проверить, что везде ли передаётся? точно нужен для кода?


    public HashMap<String, ArrayList<Entity>> getMap() {
        return map;
    }

    public static String[] getEntitiesNames() {
        return NAMES_ENTITIES;
    }

    public List<int[]> getCoordinates() {
        return coordinates;
    }

    public void addToMap(String name, ArrayList<Entity> entity) {
        map.put(name, entity);
    }

    public void addCoordinates(int[] coordinate) {
        coordinates.add(coordinate);
    }

    public void deleteCoordinates(int[] coordinate) {
        coordinates.remove(coordinate);
    }

}
