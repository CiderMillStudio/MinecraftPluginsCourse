package com.wady.javabasics2bclasses;

public class SecondClass {

    /*

    CONSTUCTORS:

    public [ClassName]() {
    // THIS CODE RUNS THE MOMENT A CLASS INSTANCE IS CREATED!
    }

    * */

    // so for this class, named SecondClass, the constructor would look like:

    public SecondClass(int number) {
        // this code runs IMMEDIATELY as a class instance is created
        System.out.println(number);
    }

    protected void protectedMethod() {
        // protected methods can be run in any class WITHIN the folder that contains this script.
        // in this situation, Main.java can access this method, but classes in other folders cannot.
        System.out.printf("\nSecondClass protected Method has been run.");
    }

    public void publicMethod() {
        // public methods can be run by ANY CLASS in the project, regardless of which folder the class is in.
        System.out.printf("\nSecondClass public Method has been run.");

    }

    private void privateMethod() {
        // private methods can only be run WITHIN the SecondClass Script.
        // in this situation, Main.java can NOT access this method.
        System.out.printf("SecondClass private Method has been run.");

    }




}
