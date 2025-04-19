package com.janbaskdemo.Loops;

public class WhileLoopConcept7 {
    public static void main(String[] args)
    {
           //WAP to print numbers from 1-100, only those numbers which are divisible by 5
           int i =1;
           while (i<=100)
           {
               if(i%5==0) {
                   System.out.println(i);//5,10,15
               }
               i++;
           }
    }
}