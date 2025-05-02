package com.janbaskdemo.callby;

public class Employee2 {
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

    public void setEmployeeFName(String employeeFName) {
        this.employeeFName = employeeFName;
    }

    public void setEmployeeLName(String employeeLName) {
        this.employeeLName = employeeLName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    private String employeeLName;
    private int empSalary;

    public void updateClass(Employee2 employee) {
        employee.employeeFName = "Kerrie";
        employee.employeeLName = "Wright";
        employee.empSalary = 10000;
    }

    public void updateClass(Employee2 employee, String employeeFName, String employeeLName, int empSalary) {
        employee.employeeFName = employeeFName;
        employee.employeeLName = employeeLName;
        employee.empSalary = empSalary;
    }

}
