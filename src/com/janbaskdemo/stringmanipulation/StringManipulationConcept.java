package com.janbaskdemo.stringmanipulation;

public class StringManipulationConcept
{
    public static void main(String[] args) {

        String statement = "The name of Employee is Jason";
        System.out.println(statement.length());

        System.out.println("================charAt()========================");
        System.out.println(statement.charAt(4));
        System.out.println(statement.charAt(1));
        System.out.println(statement.charAt(3));
        System.out.println(statement.charAt(6));

        System.out.println("================indexOf()========================");
        System.out.println(statement.indexOf('i'));
        System.out.println(statement.indexOf('h'));
        System.out.println(statement.indexOf("Ashish"));

        if(statement.indexOf("Ashish")==24)
        {
            System.out.println("He is an employee of this company");
        }
        else
        {
            System.out.println("Not an Employee");
        }



    }



}
