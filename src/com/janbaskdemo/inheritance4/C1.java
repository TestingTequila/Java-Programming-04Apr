package com.janbaskdemo.inheritance4;

import javax.swing.plaf.PanelUI;

public abstract class C1
{
    public C1()
    {
        System.out.println("Can create constructor in an abstract class");
    }
    int x;
    String name;
    public abstract void m1();
    public  void m2()
    {
        System.out.println("C1--m2");
    }
}
