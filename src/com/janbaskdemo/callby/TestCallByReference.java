package com.janbaskdemo.callby;

public class TestCallByReference
{
    public static void main(String[] args) {
        System.out.println("=========Initialize the Global Variables of the class======");
        CallByReference callByReference = new CallByReference(1,5);
        System.out.println(callByReference.getA());//1
        System.out.println(callByReference.getB());//5

        System.out.println("=============Update Value through Setter Method======");
        callByReference.setA(10);
        callByReference.setB(50);
        System.out.println(callByReference.getA());//10
        System.out.println(callByReference.getB());//50

        System.out.println("=========Updating Value through Call By Reference=======");
        callByReference.updateValue(callByReference, 100, 500);
        System.out.println(callByReference.getA());//100
        System.out.println(callByReference.getB());//500
    }
}
