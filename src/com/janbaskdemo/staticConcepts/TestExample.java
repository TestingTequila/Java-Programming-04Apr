package com.janbaskdemo.staticConcepts;

public class TestExample
{

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        System.out.println(e1.a++);//10
        System.out.println(e1.b++);//20
        System.out.println(e2.a++);//11
        System.out.println(e2.b++);//20

    }


}
