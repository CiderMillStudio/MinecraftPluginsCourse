package com.wady.javabasics4a;


public enum CoffeeSize {
    // --- ENUMs: -------------------------------------------------------------------------------------
    /*
    * An enum is a CONSTANT THAT WILL NOT BE CHANGED DURING RUNTIME.
    * An enum is a CONSTANT that you can only change BETWEEN run-times, MANUALLY.
    *
    * For formatting, ALL ENUMS ARE UPPERCASE!
    * Commas, then a semicolon at the end.
    *
    * In MineCraft pluggin dev, enums are used a TON...
    * For example, imagine you have a minigame that contains 10 maps. There are certain predefined constants
    * related to that map, like the map's name, the map's author, and the map's game-type.
    *
    */

    SMALL("Small", 2), // This enum-type is built using the constructor below
    MEDIUM("Medium", 4),
    LARGE("Large", 5);

    // For every piece of information that you want to assign to an enum type, you need to create a local variable for
    // it.
    private String name; // We'll make these PRIVATE so we can make GETTERS for each variable below.
    private int price;

    // How to make a Constructor:
    // (note, you don't need an access modifier like public or private. Just type the name of the enum):

    CoffeeSize(String _name, int _price) {
        this.name = _name;
        this.price = _price;
    }

    // --- Getters: -------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
