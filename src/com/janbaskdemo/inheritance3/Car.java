package com.janbaskdemo.inheritance3;

public class Car extends  Vehicle {

    int numberOfWheel = 4;

    @Override
    public  void engine()
    {
        System.out.println("=======CAR Engine=======");
    }
    public void start() {
        System.out.println("===Car Start===");
    }

    public final void stop() {
        System.out.println("===Car Stop===");
    }

    public void refuel() {
        System.out.println("===Car Refuel===");
    }

    public static void billing() {
        System.out.println("===Car billing===");
    }

    public static final void accelerator() {
        System.out.println("=====Car Accelerator=====");
    }

    public static void payment() {
        System.out.println("===Car payment===");
    }

    public static void payment(String brandCompany) {
        System.out.println("===Car payment===" + brandCompany);
    }

    public void payment(int amount) {
        System.out.println("===Car payment===" + amount);
    }

}
