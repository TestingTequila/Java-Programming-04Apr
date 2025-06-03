package com.janbaskdemo.exceptionHandlingConcept;

public class AppTest
{
    public static void main(String[] args) {
        String data = null;
        if(data==null)
        {
            throw new MakeItToRunTimeException("This will lead to Null pointer and data is null..");
        }
    }
}
