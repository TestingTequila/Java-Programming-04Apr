package com.janbaskdemo.Encapsulation;

public class Employee2
{
    private String empFirstName;
    private double empSalary;

    public Employee2(String empFirstName, double empSalary)
    {
        this.empFirstName= empFirstName;
        this.empSalary = empSalary;
    }

    public  String getEmpFirstName()
    {
        return empFirstName;
    }

    public  double getEmpSalary()
    {
        return empSalary;
    }


}
