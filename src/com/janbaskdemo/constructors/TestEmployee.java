package com.janbaskdemo.constructors;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee e1 = new Employee(); //Default Constructor
        Employee e2 = new Employee(100);//one int parameter 100
        Employee e3 = new Employee(100, 200);//two int parameter 100 and 200
    }
}
