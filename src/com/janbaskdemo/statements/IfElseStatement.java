package com.janbaskdemo.statements;

public class IfElseStatement
{
    public static void main(String[] args)
    {
        int age =17;
        String nationality = "American";
        boolean hasVoted = true;
        if(age>=18)
        {
            System.out.println("Person is 18 or above...");
            if(nationality.equals("American"))
            {
                System.out.println("Person is American and can vote in America...");
                if(hasVoted)
                {
                    System.out.println("The person is a responsible Citizen....");
                }
                else
                {
                    System.out.println("The person should be more aware of their constitutional Rights");
                }
            }
            else
            {
                System.out.println("Person is not American and hence cannot Vote in America...");
            }

        }
        else
        {
            System.out.println("Person is below 18 years of Age");
        }
    }
}
