package com.janbaskdemo.methodsConcepts;

public class TestMethods {
    public static void main(String[] args) {
        MethodsBasics mb = new MethodsBasics();
        mb.x = 10;
        mb.y = 8;
        mb.addition();
        mb.subtraction();
        mb.fName = "Jason";
        mb.lName = "Roger";
        mb.printFullName();
        //mb.f1; cannot access f1 variable as this is private

        System.out.println("=====================================");
        MethodsBasics3 mb3 = new MethodsBasics3();
        mb3.addition(12,8);
        mb3.subtraction(10, 20);
        mb3.multiplication(5,4);

        MethodsBasics4 mb4 = new MethodsBasics4();
        mb4.calculateTax(30000);

        System.out.println("======================================");

        MethodsAndReturnTypes mrt = new MethodsAndReturnTypes();
        mrt.addition1(12,8);


    }
}
