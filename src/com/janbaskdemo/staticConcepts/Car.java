package com.janbaskdemo.staticConcepts;

public class Car
{
    String name;
    int price;
    String color;
    static int wheels=4;
    static int steering;

    public  void start()
    {
        System.out.println("Car start......");
        Car c4= new Car();
        c4.stop();

    }
    public  void stop()
    {
        Car.rearLights();
        System.out.println("Car stop......");

    }

    public static void applyBrakes()
    {
        System.out.println("Car apply brakes......");
        Car.rearLights();
        Car c5 = new Car();
        c5.stop();
    }

    public static void rearLights()
    {
        System.out.println("Car rearLights......");
    }

}


//1. How to call non-static variables and methods: through Object reference variable
//2. How to call static variables and methods: Directly through Class Name
//3. How to call static methods inside other static method: Directly/ClassName
//3. How to call non-static methods inside other non-static method: Directly/Object reference variable
//4. How to call non-static methods inside other static method: Object reference variable
//4. How to call static methods inside other non-static method: Object reference variable
