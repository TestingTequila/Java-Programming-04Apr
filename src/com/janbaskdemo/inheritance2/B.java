package com.janbaskdemo.inheritance2;

public class B extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+2*b;
        System.out.println("SUM BY B: " + sum);
    }
}
