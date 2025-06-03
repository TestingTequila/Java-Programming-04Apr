package com.janbaskdemo.exceptionHandlingConcept;

import java.time.chrono.ThaiBuddhistChronology;

public class ThrowsConcept {
    int x = 10;
    int y = 0;

    public void m1() throws ArithmeticException {
        int division = x / y;
        System.out.println("Division: " + "Will this be printed");
    }

    public void m2() throws ArithmeticException{
        m1();
        System.out.println("m2");
    }

    public  void m3()
    {
        try {
            m2();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ThrowsConcept tc = new ThrowsConcept();
        tc.m3();
        System.out.println("Bye.....");
    }
}
