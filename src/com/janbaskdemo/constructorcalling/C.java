package com.janbaskdemo.constructorcalling;

public class C extends P
{
    public C()
    {
//        super("Text");
        System.out.println("C: Default Constructor");
    }

    public C(String text)
    {
        super("text1");
        System.out.println("Parametrized Constructor in C: " + text);
    }
}
