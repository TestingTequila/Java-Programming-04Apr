package com.janbaskdemo.Loops;

public class ForLoopConcept5
{
    public static void main(String[] args) {
        //WAP to print the digits of a number

        for (int number = 3353453;number!=0;number=number/10)
        {
            int digit =number%10;
            System.out.println(digit);

        }
    }

}
