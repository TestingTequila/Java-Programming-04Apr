package com.janbaskdemo.Encapsulation;

public class Employee3
{
    private String empFirstName;
    private double empSalary;

    public Employee3(String empFirstName, double empSalary)
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

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
