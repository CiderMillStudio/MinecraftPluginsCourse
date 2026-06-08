package com.wady.javabasics3aarrayshashmapslistslooops;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    // --- ARRAYS:  --------------------------------------------------------------------------
        // Note that the format to declare AND initialize arrays in the same line is:
        // Type[] arrayName = new Type[]{x, y, z};
        // don't forget the [] in the Type[]{x, y, z}!
        String[] pokemonArray = new String[]{"Piplup", "Chimchar", "Turtwig"};

        try {
            System.out.printf(pokemonArray[0]);
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("OUT OF BOUNDS! Try again");
            e.printStackTrace();
        }

        pokemonArray[0] = "Pikachu";
        // note that when you do pokemonArray. --> there are not too many methods available, compared with Lists.

        try {
            System.out.println(pokemonArray[0]);
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("OUT OF BOUNDS! Try again");
            e.printStackTrace();
        }

    // --- LISTS:  --------------------------------------------------------------------------
        // lists are kinda like arrays on steroids. (lists are user-friendly arrays)
        List<String> pokemonList = new ArrayList<>();
        pokemonList.add("Charmander");
        pokemonList.add("Squirtle");
        pokemonList.add("Bulbasaur");

        String youChoseWho = pokemonList.get(2);

        System.out.println(youChoseWho);

    // --- LINKED LISTS ------------------------------------------------------------------------
        // Linked Lists provide more methods for us to use.
        // using .addFirst and .removeFirst, and other similar methods for LinkedLists, you can
        // MAINTAIN LIST ORDER!

        List<String> toolTypes = new LinkedList<>();
        toolTypes.addFirst("pickaxe");
        toolTypes.addFirst("sword");
        toolTypes.addFirst("banana-hammer");
        toolTypes.removeLast(); // because what the heck is a banana hammer
        toolTypes.addFirst("axe");

        System.out.println(toolTypes.getFirst());



    // --- HASHMAPS: ---------------------------------------------------------------------------
        // HashMaps use KEYS and VALUES (kinda like dictionaries?)

        HashMap<String, String> pokemonTypeHashmap = new HashMap<>();

        pokemonTypeHashmap.put("Charmeleon", "Fire"); // this is how you add a new key-value pair to the hashmap.
        pokemonTypeHashmap.put("Squirtle", "Water");
        pokemonTypeHashmap.put("Pikachu", "Electric");

        System.out.println(pokemonTypeHashmap.get("Charmeleon"));
        System.out.println(pokemonTypeHashmap.keySet().toArray()[0]); // this is how you get the set of keys and convert to array, and get a value
        System.out.println(pokemonTypeHashmap.values().toArray()[0]); // same with values


    // Hashmaps will be SUPER USEFUL in Minecraft Pluggin Development.


    // --- LINKED HASHMAPS: --------------------------------------------------------------------
        // Linked Hashmaps helps maintain ORDER like Linked Lists?
        HashMap<String, String> blockTypeHashmap = new LinkedHashMap<>();

        blockTypeHashmap.keySet(); // returns a SET of ALL THE KEYS



    // --- FOR LOOPS: ------------------------------------------------------------------------------

        System.out.println("\nFor-loop for the Pokemon Array:");
        for (int i = 0; i < pokemonArray.length; i++) {
            // note that 'length' returns the actual COUNT of things in the array, not index number.
            System.out.println(pokemonArray[i]);
        }

        System.out.println("\nFor-loop for the Pokemon List:");
        for (int i = 0; i < pokemonList.size(); i++) {          // note we get the list SIZE, not length.
            System.out.println(pokemonList.get(i));
        }

        System.out.println("\nFor-loop for the Pokemon Type Hashmap:");
        for (int i = 0; i < pokemonTypeHashmap.size(); i++) {
            System.out.println("Key: " + pokemonTypeHashmap.keySet().toArray()[i]);
            System.out.println("Value: " + pokemonTypeHashmap.values().toArray()[i]);
        }


    // --- ENHANCED FOR-LOOP (FOREACH): ---------------------------------------------------------------------
        // in Java, THERE IS NO "FOREACH" LOOP. instead, you just write "for" and proceed as if you typed "foreach"
        // This is called an ENHANCED FOR LOOP.
        System.out.println("\nEnhanced For-loop of Pokemon Array:");
        for (String string : pokemonArray) { // translates to: foreach (String string in pokemonArray):
            System.out.println(string);
        }











    }

}
