package com.janbaskdemo.exceptionHandlingConcept;

public class ErrorConcept
{
    public  void m1()
    {
        m2();
    }

    public  void m2()
    {
       m3();
    }

    public  void m3()
    {
          m4();
    }

    public  void m4()
    {
          m1();
    }

    public static void main(String[] args) {
        ErrorConcept ec = new ErrorConcept();
        ec.m1();
    }
}
