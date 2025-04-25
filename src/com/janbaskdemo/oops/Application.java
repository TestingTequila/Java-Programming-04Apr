package com.janbaskdemo.oops;

public class Application
{
    public void addition(int a, int b)
    {
        System.out.println(a+b);
    }

    public void addition(int a, double b)
    {
        System.out.println(a+b);
    }

    public void addition(double a, double b)
    {
        System.out.println(a+b);
    }

    public void addition(float a, double b)
    {
        System.out.println(a+b);
    }

    public void addition(double a, float b)
    {
        System.out.println(a+b);
    }

    public void addition(float a, double b, int c)
    {
        System.out.println(a+b+c);
    }

    public double addition(char a, double b, int c)
    {
        System.out.println(a+b+c);
        return a+b+c;
    }
}
