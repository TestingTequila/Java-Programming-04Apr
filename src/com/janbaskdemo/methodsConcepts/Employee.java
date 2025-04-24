package com.janbaskdemo.methodsConcepts;

public class Employee
{
    // basic salary, travel allowance
    public  double calculateSalary(double basicSalary, double travelAllowance)
    {
        double salary =basicSalary + travelAllowance;
        System.out.println("My Salary: " + salary);
        return salary;
    }


}
