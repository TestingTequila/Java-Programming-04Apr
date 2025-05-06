package com.janbaskdemo.inheritance3;

public class Test {
    public static void main(String[] args) {
        System.out.println("======CAR=======================");
        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        System.out.println(car.numberOfWheel);//4
        car.engine(); //Car engine


        System.out.println("======BMW=======================");
        BMW bmw = new BMW();
        bmw.autoParking();
        bmw.isAutomatic();
        bmw.start();
        bmw.stop();
        bmw.refuel();
        BMW.billing(); // BMW billing
        System.out.println(bmw.numberOfWheel);//8
        bmw.payment(3, 6000);

        System.out.println(" =====In a P-C Relationship=====");
        //1. Child can inherit everything parent has
        //2. Parent can have only what belongs to them, they cannot inherit child methods
        //car.autoParking();
        //car.isAutomatic();

        //Top Casting
        System.out.println("====Top Casting===");
        Car car1=new BMW();
        car1.start(); //BMW Start
        car1.stop(); // Car stop
        car1.refuel(); //Car Refuel
        Car.billing(); //Car billing
        System.out.println(car1.numberOfWheel);//4
        car1.payment(5000);
        car1.engine(); // BMW Engine


        //Down Casting
        System.out.println("=====Down Casting=====");
        //       BMW bmw1 = (BMW)new Car(); // Down-casting is not allowed in Java
//        bmw.start();
//        bmw.stop();
//        bmw.refuel();
//        bmw.autoParking();
//        bmw.isAutomatic();

        System.out.println("====Top Casting among Vehicle and Car");
        Vehicle vehicle=new Car();
        vehicle.engine();

        System.out.println("====Top Casting among Vehicle and Car");

       Vehicle vehicle1 = new BMW();
       vehicle1.engine();


    }
}
