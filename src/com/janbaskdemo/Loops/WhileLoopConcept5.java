package com.janbaskdemo.Loops;

public class WhileLoopConcept5
{
    public static void main(String[] args) {
        //WAP to print the digits of a number
        int number = 3353453;
        while (number!=0)
        {
            int digit =number%10;
            System.out.println(digit);
            number=number/10;
        }
    }

}
