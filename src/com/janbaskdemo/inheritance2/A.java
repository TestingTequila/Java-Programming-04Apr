package com.janbaskdemo.inheritance2;

public class A extends  Base
{
    @Override
    public void addition(int a, int b) {
        int sum = a+b;
        System.out.println("SUM BY A: " + sum);
    }
}
