package com.wady.switches_dateAndTime_randomness;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] _args) {
        // --- SWITCH STATEMENTS: --------------------------------------------------------------------------------
        // A Switch Statement is basically a way to easily format a lot of "if/else" statements:
        String word = "kiwasl";

        // here is a convoluted (silly) if/else tree which is ugly and inefficient!
        if (word.equals("banana")) {

        } else if (word.equals("apple")) {

        } else if (word.equals("pear")) {

        } else if (word.equals("kiwi")) {

        }

        // As you can see from above, lots of "if/else" statements back-to-back are quite ugly and hard to read...
        // That's where SWITCH statements come in! (in fact, switch statements are FASTER than the if/else disaster
        // above. So when you are aiming for code optimization in your Minecraft pluggin, it will help the game run
        // faster if you use SWITCHES instead of convoluted if/else trees).

        switch (word) {
            case "banana":
                System.out.println("Banana is the right word!");
                return; // "return" Stops the code here, and does not execute the remainder of the current method.
            case "apple":
                System.out.println("Not an apple!");
                break; // "break" gets out of the loop/case block, but continues the rest of the method.
            case "pear":
                System.out.println("Not a pear!");
                break;
            case "kiwi":
                System.out.println("Not a kiwi!");
                break;
            // DEFAULT: if none of the cases work, DEFAULT will run.
            default:
                System.out.println("Not a fruit at all, silly goose!");
                break;

        }

        System.out.println("This line will only print after a \"break\", not a \"return\"");


        // --- DATE & TIME: -------------------------------------------------------------------------
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.DAY_OF_YEAR, 1);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        System.out.println((cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.YEAR));

        // --- RANDOMNESS: ----------------------------------------------------------------------------
        Random random = new Random();
        System.out.println(random.nextInt(10));


    }



}
