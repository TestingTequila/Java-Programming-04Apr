package com.janbaskdemo.methodsConcepts;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        double mySalary =emp.calculateSalary(6000, 3000);
        System.out.println(mySalary + 1000);
    }
}
