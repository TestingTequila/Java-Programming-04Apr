package com.janbaskdemo.Encapsulation;

public class Employee
{
    private String empFirstName;
    private double empSalary;

    public  void setEmpFirstName(String empFirstName)
    {
        String[] employeeNames = {"Jason", "Kerrie", "John", "Ritu"};
        for(String emp: employeeNames)
        {
            if(emp.equals(empFirstName))
            {
                this.empFirstName = empFirstName;
                break;
            }
            else
            {
                this.empFirstName = "N/A";
            }
        }

    }

    public  void setEmpSalary(double empSalary)
    {
        if(empSalary>1000 && empSalary<=10000) {
            this.empSalary = empSalary;
        }
        else
        {
            this.empSalary =0.0;
        }
    }

    public String getEmpFirstName()
    {
        return empFirstName;
    }

    public  double getEmpSalary()
    {
        return empSalary;
    }
}
