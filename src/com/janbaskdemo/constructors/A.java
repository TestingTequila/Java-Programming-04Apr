package com.janbaskdemo.constructors;

public class A {

    //An invisible constructor is already created here - Default Constructor

    public A() {
        a = 10;
        b = 20;
        bl = true;
        s = "Kerrie";
    }

    int a;
    byte b;
    boolean bl;
    String s;

    public int m1() {
        System.out.println("m1");
        return 10;
    }
}
