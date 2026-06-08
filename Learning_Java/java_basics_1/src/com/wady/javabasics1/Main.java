package com.wady.javabasics1;

// Think of a class as a page in a book. The Main class is the one that links everything together.
public class Main {

    public static void main(String[] _args) {

        // a variable in Java, represents an object (as in Object-Oriented Programming) which is stored in memory.

        // PRIMITIVE data-types (most of the time we'll be using these):
        int number = 5;
        float light_decimal_number = 104.5f;    // ~7 decimal places of precision (32 bits)
        double heavy_decimal_number = 102.5;    // ~16 decimal places of precision (64 bits)
        boolean my_bool = false;                // notice you have to write "boolean", not just "bool"
        char letter = 'M';                      // just a single character
                                                // notice there is no primitive 'string' datatype in Java.

        // NON-PRIMITIVE data-types (also called "Wrapper classes":
        String phrase = "This is a test.";      // with a capital "S"
        // phrase.SO_MANY_METHODS               // since String is a class, you can do a lot with each String type var.
        System.out.println(phrase);             // this is how you print to the java terminal
        Integer number2 = 5;                    // this time, "Integer" is a CLASS, not just a data-type
        // number2.SO_MANY_METHODS              // as opposed to number which is not type Integer, but rather type int.
        Double double2 = 5.5;
        Boolean boolean2 = false;
        Character letter2 = 'N';


        printMessage("This method works!");
        int result = printMessage("getting integer now");
        System.out.println(result);
    }

    private static int printMessage(String _message) {
        System.out.println(_message);           // type "sout" to get shortcut, then hit tab!
        return 12;                              // We're learning how to return variables!
    }

}
