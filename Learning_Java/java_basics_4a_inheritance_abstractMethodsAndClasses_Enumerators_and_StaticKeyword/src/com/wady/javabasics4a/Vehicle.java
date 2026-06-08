package com.wady.javabasics4a;

public abstract class Vehicle {

    private int wheels;
    private String color;

    public Vehicle(int _wheels, String _color) {
        this.wheels = _wheels;
        this.color = _color;
    }

    public int getWheels() { return wheels; }
    public String getColor() { return color; }

    public int calculate() {
        return wheels * 2;
    }

    // ABSTRACT METHODS:
    // okay so what is an ABSTRACT METHOD?
    // Let's say you have a parent class (like Vehicle) who has children classes (Car, Motorbike), and each child
    // needs to have their own activateBreaks() method, but we want to be able to call activateBreak() from the
    // VEHICLE parent class instead of the specific child class. For example, if we wanted ALL vehicles to break, we
    // could do:
    // for (Vehicle vehicle : vehicleList) {
    //      vehicle.activateBreaks()
    // }
    // but if each "activateBreaks()" method within each child class is DIFFERENT (i.e. if Motorbikes break differently
    // than Cars do), then we need to make this an ABSTRACT CLASS
    //
    // BIG POINT: if a class contains an abstract method, you must make it an ABSTRACT CLASS as well!
    public abstract void activateBreaks();




}
