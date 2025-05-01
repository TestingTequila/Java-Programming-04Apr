package com.janbaskdemo.thisKeyword;

public class TestA
{
    public static void main(String[] args) {
        A a = new A(100, "Amit");
        System.out.println(a.getNumber());
        System.out.println(a.getName());
        a.setNumber(500);
        a.setName("Amber");

        System.out.println("==============After Updating the Object=========");
        System.out.println(a.getNumber());
        System.out.println(a.getName());

    }
}
