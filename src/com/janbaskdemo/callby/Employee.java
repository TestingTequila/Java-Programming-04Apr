package com.janbaskdemo.callby;

public class Employee {
    private String employeeFName;

    public String getEmployeeFName() {
        return employeeFName;
    }

    public String getEmployeeLName() {
        return employeeLName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public Employee(String employeeFName, String employeeLName, int empSalary) {
        this.employeeFName = employeeFName;
        this.employeeLName = employeeLName;
        this.empSalary = empSalary;
    }

    private String employeeLName;
    private int empSalary;

    public void updateClass(Employee employee) {
        employee.employeeFName = "Kerrie";
        employee.employeeLName = "Wright";
        employee.empSalary = 10000;
    }

    public void updateClass(Employee employee, String employeeFName, String employeeLName, int empSalary) {
        employee.employeeFName = employeeFName;
        employee.employeeLName = employeeLName;
        employee.empSalary = empSalary;
    }

}
