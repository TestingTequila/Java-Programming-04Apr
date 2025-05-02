package com.janbaskdemo.inheritance2;

public class D extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 4*a+4*b;
        System.out.println("SUM BY D: " + sum);
    }
}
