package com.janbaskdemo.statements;

public class IfElseIfStatement2
{
    public static void main(String[] args) {
        String browserName = "Chrome";
        if(browserName.equals("IE"))
        {
            System.out.println("Execute your Test cases on IE Browser");
        }
        else if (browserName.equals("Chrome"))
        {
            System.out.println("Execute your Test cases on Chrome Browser");
        }
        else if (browserName.equals("Firefox"))
        {
            System.out.println("Execute your Test cases on Firefox Browser");
        }
        else if (browserName.equals("Edge"))
        {
            System.out.println("Execute your Test cases on Edge Browser");
        }
        else
        {
            System.out.println("Please provide a correct browser name....");
        }
    }
}
