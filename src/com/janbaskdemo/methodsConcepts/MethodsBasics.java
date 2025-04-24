package com.janbaskdemo.methodsConcepts;

public class MethodsBasics {

    //WAP to perform addition of two integer numbers
    int x;
    int y;

    public void addition() {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is: " + sum);
    }

    public void subtraction() {
        int diff = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is: " + diff);
    }

    //wap to print the full name of a person

    String fName;
    String lName;

    public void printFullName() {
        String completeName = fName + " " + lName;
        System.out.println("Name of Person is: " + completeName);
    }

    private float f1;

}
