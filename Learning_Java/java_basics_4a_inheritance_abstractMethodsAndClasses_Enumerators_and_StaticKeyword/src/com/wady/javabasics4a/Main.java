package com.wady.javabasics4a;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] _args) {
        // --- ABSTRACT CLASSES / INHERITANCE: -----------------------------------------------
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car());
        vehicleList.add(new Motorbike());

        vehicleList.get(0).getWheels();

        for (Vehicle vehicle : vehicleList) {
            vehicle.activateBreaks();
        }


        // --- ENUMs: ---------------------------------------------------------------------------
        CoffeeSize myCoffeeOrder = CoffeeSize.MEDIUM;
        System.out.println("A customer has just ordered a " + myCoffeeOrder.getName() + " coffee for $" + myCoffeeOrder.getPrice());
    }
}
