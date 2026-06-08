package com.wady.javabasics4a;

public class Car extends Vehicle {

    public Car() {
        super(4, "red"); //

        calculate();
    }


    public void handbrake() {
        // function that turns on the car brakes (only applies to cars, not other vehicles)
    }

    @Override
    public void activateBreaks() {

    }
}
