package com.janbaskdemo.exceptionHandlingConcept;

public class RunTimeExceptions_RTE
{
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int divide = 0;
        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        String name = null;


        try {
            name.length(); //NPE
            divide = x/y; //AE
        }

        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

        catch (ArithmeticException e)
        {
            e.printStackTrace(); //
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


        System.out.println(" this is the program i want to present for demo...");
        System.out.println("Division: " + divide);
    }

    //AE
}
