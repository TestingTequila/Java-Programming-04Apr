package com.janbaskdemo.exceptionHandlingConcept;

public class TryCatchFinally
{
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int divide = 0;
        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        try {
            divide = x/y;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("I will always execute.....");
        }



        System.out.println(" this is the program i want to present for demo...");
        System.out.println("Division: " + divide);
    }

    //AE
}
