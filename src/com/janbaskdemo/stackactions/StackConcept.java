package com.janbaskdemo.stackactions;

public class StackConcept
{
    public void m1()
    {
        System.out.println("m1..");
        m2();
    }

    public void m2()
    {
        System.out.println("m2..");
        m3();
    }

    public void m3()
    {
        System.out.println("m3..");
        m4();
    }

    public void m4()
    {
        System.out.println("m4..");
    }
}
