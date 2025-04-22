package com.janbaskdemo.classAndobjects;

public class TestAutomobile
{
    public static void main(String[] args) {
        Automobile car = new Automobile();
        car.typeOfAutomobile = "Car";
        car.transitionType = "Automatic";
        car.fuelUsed = "Petrol";
        car.numberOfWheels =4;
        car.hasSunroof = true;

       Automobile truck = new Automobile();
       truck.typeOfAutomobile = "Truck";
       truck.transitionType ="Manual";
       truck.fuelUsed = "Diesel";
       truck.numberOfWheels= 10;
       truck.hasSunroof = false;
    }
}
