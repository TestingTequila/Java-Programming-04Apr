package com.janbaskdemo.methodsConcepts;

public class MethodsAndReturnTypes
{
    public  void addition1(int x, int y)
    {
        int sum =x+y;
        System.out.println("addition1: "+sum);
    }

    public  int addition2(int x, int y)
    {
        int sum =x+y;
        System.out.println("addition2: "+sum);
        return sum;
    }

}
