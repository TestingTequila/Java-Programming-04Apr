package com.janbaskdemo.inheritance2;

public class C extends Base
{

    @Override
    public void addition(int a, int b) {
        int sum = 3*a+3*b;
        System.out.println("SUM BY C: " + sum);
    }
}
