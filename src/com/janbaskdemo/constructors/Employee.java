package com.janbaskdemo.constructors;

public class Employee
{
     public Employee()
     {
         System.out.println("Default Constructor");
     }

    public Employee(int a)
    {
        System.out.println("one int parameter " + a);
    }

    public Employee(int a, int b)
    {
        System.out.println("two int parameter " + a  + " and " + b);
    }
}
