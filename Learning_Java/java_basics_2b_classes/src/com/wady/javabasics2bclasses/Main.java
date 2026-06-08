package com.wady.javabasics2bclasses;

public class Main {

    public static void main(String[] args) {

        // Here, we'll talk about Classes, Constructors, and Instances:

        int our_number = 12;

        SecondClass secondClass = new SecondClass(our_number); // this is how we make a new instance of a class!

        secondClass.protectedMethod();
        secondClass.publicMethod();

    }


    }

