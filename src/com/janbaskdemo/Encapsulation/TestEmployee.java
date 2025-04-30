package com.janbaskdemo.Encapsulation;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpFirstName("Robert");
        employee.setEmpSalary(10000);
        System.out.println("Pay the Employee " + employee.getEmpFirstName() + " a Salary of $" + employee.getEmpSalary());

        System.out.println("==========================================================");

        Employee2 employee2 = new Employee2("Kerrie", 5000);
        System.out.println("Pay the Employee " + employee2.getEmpFirstName() + " a Salary of $" + employee2.getEmpSalary());

        System.out.println("==========================================================");

        Employee3 employee3 = new Employee3("Alley", 50000);
        System.out.println("Pay the Employee " + employee3.getEmpFirstName() + " a Salary of $" + employee3.getEmpSalary());
        employee3.setEmpSalary(8000);
        System.out.println("Pay the Employee " + employee3.getEmpFirstName() + " a Salary of $" + employee3.getEmpSalary());


    }
}
