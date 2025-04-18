package com.janbaskdemo.statements;

public class IfElseIfStatement
{
    public static void main(String[] args) {
        if(true)
        {
            System.out.println("First Condition is true");
        }
        else if (false)
        {
            System.out.println("This is second Condition");
        }

        else if (true)
        {
            System.out.println("This is third Condition");
        }
        else if (false)
        {
            System.out.println("This is fourth Condition");
        }
        else
        {
            System.out.println("This is executed as all the above conditions failed....");
        }
    }


}
