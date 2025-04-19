package com.janbaskdemo.Loops;

public class WhileLoopConcept6
{
    public static void main(String[] args) {

        //WAP to print the table of 4
        int i =1;
        while (i<=10)
        {
            if(i*4==28)
            {
                break;
            }
            System.out.println(4*i);//4, 8, 12, 16, 20, 24, 28, 32, 36, 40
            i++;
        }
    }
}
