package com.janbaskdemo.callby;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee("Jason", "Hill", 6000);
        System.out.println(employee.getEmployeeFName());
        System.out.println(employee.getEmployeeLName());
        System.out.println(employee.getEmpSalary());

        System.out.println("=================Updating the private variables=============");
        employee.updateClass(employee);
        System.out.println(employee.getEmployeeFName());
        System.out.println(employee.getEmployeeLName());
        System.out.println(employee.getEmpSalary());

        System.out.println("=================Updating the private variable===============");
        employee.updateClass(employee, "Tony", "Blair", 20000);
        System.out.println(employee.getEmployeeFName());
        System.out.println(employee.getEmployeeLName());
        System.out.println(employee.getEmpSalary());
    }
}
