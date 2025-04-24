package com.janbaskdemo.methodsConcepts;

public class TestMethods2 {
    public static void main(String[] args) {
        MethodsAndReturnTypes mrt = new MethodsAndReturnTypes();
        //int total1=mrt.addition1(12, 8); //void

        int total2=mrt.addition2(12, 8); //int
        System.out.println(total2*5);
    }
}
