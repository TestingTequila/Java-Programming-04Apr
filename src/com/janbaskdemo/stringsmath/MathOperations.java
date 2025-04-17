package com.janbaskdemo.stringsmath;

public class MathOperations
{
    public static void main(String[] args) {
        //1. I/I = Integer Part

        System.out.println(10/2); //5
        System.out.println(10/3); //3
        System.out.println(10/4); //2

        //2. Decimal/I, I/Decimal, Decimal/Decimal = Actual Result [IntegerPart.Decimal]
        System.out.println(10.0/2);//5.0
        System.out.println(10.0/3);//3.3333333333333335
        System.out.println(10/3.0);//3.3333333333333335
        System.out.println(10.0/3.0); //3.3333333333333335

        //3. modulo operator [%]
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(10.0%3);//1.0
        System.out.println(10.3%3);//1.3000000000000007
        System.out.println(10%4); //2

        //4. Increment/Decrement Operator
             //post increment operator
             //pre increment operator
             //post decrement operator
             //pre decrement operator
    }
}
