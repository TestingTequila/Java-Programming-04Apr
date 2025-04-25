package com.janbaskdemo.staticConcepts;

public class TestCar
{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMW";
        car1.color = "Blue";
        car1.price = 70000;
        car1.start();
        car1.stop();
        Car.applyBrakes();
        Car.rearLights();
        System.out.println(car1.name + ", " + car1.price + ", " + car1.color + ", "+ Car.wheels+ ", " + Car.steering);

        Car car2 = new Car();
        car2.name = "Audi";
        car2.color = "Red";
        car2.price = 170000;
        System.out.println(car2.name + ", " + car2.price + ", " + car2.color + ", "+ Car.wheels + ", " + Car.steering);

        Car car3 = new Car();
        car3.name = "Tesla";
        car3.color = "White";
        car3.price = 150000;
        System.out.println(car1.name + ", " + car3.price + ", " + car1.color + ", "+ Car.wheels + ", " + Car.steering);




    }
}
