package com.wady.javabasics2;

public class Main {

    public static void main(String[] args) {

        // NULL VALUES AND EXCEPTIONS:

        String string = null; // 'null' means that you cannot use it anywhere. It means that the variable points to NOTHING.

        // System.out.println(string.substring(0)); // this will generate an exception, because the string var is null.

        // When a null exception occurs (Null Pointer Exception), the code STOPS at the line of the exception, and the code beneath
        // it is not executed. So we need to catch these exceptions and tell Java how to handle them as they arise.
        // Here's the format:
        /*
        try {
                [put the cod you want to try HERE]
        } catch ([input the exception you're trying to catch HERE] e) {
                System.out.printf("oops! Here's what went wrong: ...");
                e.printStackTrace();
        }
        */

        try {
            System.out.println(string.substring(0)); // this will generate teh NullPointerException, as "string" is null!
        } catch(NullPointerException e) {
            System.out.printf("I have errored!"); // this line helps us understand what happened
            e.printStackTrace();                // this line prints out the exact error call that WOULD have previously halted
                                                // the entire method!
        }


    }

}
