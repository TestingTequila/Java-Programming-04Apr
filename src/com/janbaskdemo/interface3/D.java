package com.janbaskdemo.interface3;

public class D implements Base
{

    @Override
    public void addition(int a, int b) {
        System.out.println(4*(a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println(4*(a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println(4*(a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println(4*(a/b));
    }
}
