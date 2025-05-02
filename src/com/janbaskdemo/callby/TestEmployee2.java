package com.janbaskdemo.callby;

public class TestEmployee2
{
    public static void main(String[] args) {

        Employee2 employee2 = new Employee2();

        System.out.println("===============setting private variables through setter method============");
        employee2.setEmployeeFName("Mary");
        employee2.setEmployeeLName("Fletcher");
        employee2.setEmpSalary(8000);

        System.out.println(employee2.getEmployeeFName());
        System.out.println(employee2.getEmployeeLName());
        System.out.println(employee2.getEmpSalary());

        System.out.println("====Updating private variables====");
        employee2.updateClass(employee2);
        System.out.println(employee2.getEmployeeFName());
        System.out.println(employee2.getEmployeeLName());
        System.out.println(employee2.getEmpSalary());

        System.out.println("====Updating private variables====");
        employee2.updateClass(employee2, "Ben", "Defler", 12000);
        System.out.println(employee2.getEmployeeFName());
        System.out.println(employee2.getEmployeeLName());
        System.out.println(employee2.getEmpSalary());
    }
}
