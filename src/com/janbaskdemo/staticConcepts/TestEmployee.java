package com.janbaskdemo.staticConcepts;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empName = "Jason";
        employee.salary =464564;
        System.out.println(employee.empName);//Jason
        System.out.println(employee.salary);//464564
        System.out.println(Employee.companyName);//Microsoft
    }
}
