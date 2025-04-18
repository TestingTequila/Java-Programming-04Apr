package com.janbaskdemo.statements;

public class MultipleIfWithElseStatement
{
    public static void main(String[] args) {
        if(true)
        {
            System.out.println("This is first Condition");
        }
        if(false)
        {
            System.out.println("This is second Condition");
        }
        if(true)
        {
            System.out.println("This is third Condition");
        }
        if(false)
        {
            System.out.println("This is fourth Condition");
        }
        else
        {
            System.out.println("This is executed as all the above conditions failed....");
        }
    }
}
