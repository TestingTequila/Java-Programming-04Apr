package com.janbaskdemo.thisKeyword;

public class TestRegistration
{
    public static void main(String[] args) {
        Registration registration = new Registration("Jason", "Roger", 32);
        System.out.println(registration.fName);//Kerrie
        System.out.println(registration.lName);//Wright
        System.out.println(registration.age);//0
        System.out.println(registration.totalExp);//32

        System.out.println("=========================================");
        Registration registration1 = new Registration("John", "Lehman", 40, 15);
        System.out.println(registration1.fName);//John
        System.out.println(registration1.lName);//Lehman
        System.out.println(registration1.age);//40
        System.out.println(registration1.totalExp);//15
    }
}
