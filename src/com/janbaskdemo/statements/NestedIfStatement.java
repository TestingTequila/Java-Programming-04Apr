package com.janbaskdemo.statements;

public class NestedIfStatement
{
    public static void main(String[] args) {
        int age = 19;
        String nationality = "American";
        boolean hasVoted = false;
        if(age>=18)
        {
            System.out.println("Person is above 18 years of Age");
            if(nationality.equals("American"))
            {
                System.out.println("Yes, the person is American and can definitely Vote");
                if(hasVoted)
                {
                    System.out.println("You will have some Tax benefits....");
                }
            }
        }
    }
}
