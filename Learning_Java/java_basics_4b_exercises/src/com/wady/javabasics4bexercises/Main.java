package com.wady.javabasics4bexercises;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String _args) {
        List<Entity> listOfEntities = new ArrayList<>();

        listOfEntities.add(new Zombie(5, 2, 2));
        listOfEntities.add(new Skeleton(3, 4, 2));
        listOfEntities.add((new Spider(4, 3, 1)));

        for (Entity entity : listOfEntities) {
            entity.moveTowardPlayer();
        }


    }
}
