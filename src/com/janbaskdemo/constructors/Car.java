package com.janbaskdemo.constructors;

public class Car
{
    String carName;
    String color;
    int price;
    boolean isAutomatic;
    public Car(String carName, String color)
    {
        this.carName = carName;
        this.color = color;
    }

    public Car(String carName, String color, int price)
    {
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    public Car(String carName, String color, int price, boolean isAutomatic)
    {
        this.carName = carName;
        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public Car(int price, boolean isAutomatic)
    {
        this.price = price;
        this.isAutomatic = isAutomatic;
    }
}
