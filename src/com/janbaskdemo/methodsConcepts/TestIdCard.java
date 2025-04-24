package com.janbaskdemo.methodsConcepts;

public class TestIdCard
{
    public static void main(String[] args) {
        NameOnIDCard name = new NameOnIDCard();
        String empFName =name.printNameOnIdCard("Kerrie", "Wright");
        System.out.println(" Name to printed on ID Card is: " + empFName + " MEDMA");
    }
}
