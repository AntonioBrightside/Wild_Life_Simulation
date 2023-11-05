package com.brightside.simulation;

import com.brightside.entities.Entity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс-хранитель данных.
 */
public class Map {

    private static final String[] NAMES_ENTITIES = {"Grass", "Rock", "Tree", "Water", "Herbivore", "Predator"};
    private HashMap<String, ArrayList<Entity>> map = new HashMap<>();
    private ArrayList<int[]> coordinates = new ArrayList<>();


    public HashMap<String, ArrayList<Entity>> getMap() {
        return map;
    }

    public static String[] getEntitiesNames() {
        return NAMES_ENTITIES;
    }

    public ArrayList<int[]> getCoordinates() {
        return coordinates;
    }

    public void addToMap(String name, ArrayList<Entity> entity) {
        map.put(name, entity);
    }

    public void addCoordinates(int[] coordinate) {
        coordinates.add(coordinate);
    }

}
