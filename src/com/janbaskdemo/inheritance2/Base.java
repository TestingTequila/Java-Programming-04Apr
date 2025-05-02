package com.janbaskdemo.inheritance2;

public abstract class Base
{
    public  abstract void addition(int a, int b);

    public  void subtraction(int a, int b)
    {
        int diff =a-b;
        System.out.println("SUBTRACTION: " + diff);
    }

    public  void multiplication(int a, int b)
    {
        int product =a*b;
        System.out.println("MULTIPLICATION: " + product);
    }

    public  void division(int a, int b)
    {
        int divide =a/b;
        System.out.println("DIVIDE: " + divide);
    }
}
