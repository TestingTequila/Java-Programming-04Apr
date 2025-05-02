package com.janbaskdemo.callby;

public class TestCallByValue
{
    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        int total=callByValue.addition(12,8);
        System.out.println("Sum: " + total);
    }
}
