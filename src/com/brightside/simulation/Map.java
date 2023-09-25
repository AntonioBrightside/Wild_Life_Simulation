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

    private static final String[] namesEntities = {"Grass", "Rock", "Tree", "Water", "Herbivore", "Predator"};
    private static HashMap<String, ArrayList<Entity>> map = new HashMap<>();
    private static ArrayList<int[]> coordinates = new ArrayList<>();

    public static HashMap<String, ArrayList<Entity>> getDict() {
        return map;
    }

    public static String[] getNamesEntities() {
        return namesEntities;
    }

    public static ArrayList<int[]> getCoordinates() { return coordinates; }

    public static void addToDict(String name, ArrayList<Entity> entity) {map.put(name, entity);}

    public static void addCoordinates(int[] coordinate) {coordinates.add(coordinate);}
}
