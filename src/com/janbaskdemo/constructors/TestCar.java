package com.janbaskdemo.constructors;

public class TestCar
{
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "White");
        System.out.println(c1.carName);//Audi
        System.out.println(c1.color);//White
        System.out.println(c1.price);//0
        System.out.println(c1.isAutomatic);//false
        System.out.println("----------------------------------------");
        Car c2 = new Car("Tesla", "Blue", 43543);
        System.out.println(c2.carName);//Tesla
        System.out.println(c2.color);//Blue
        System.out.println(c2.price);//43543
        System.out.println(c2.isAutomatic);//false
        System.out.println("----------------------------------------");
        Car c3 = new Car("BMW", "Red", 5646544, true);
        System.out.println(c3.carName);//BMW
        System.out.println(c3.color);//Red
        System.out.println(c3.price);//5646544
        System.out.println(c3.isAutomatic);//true
    }
}
