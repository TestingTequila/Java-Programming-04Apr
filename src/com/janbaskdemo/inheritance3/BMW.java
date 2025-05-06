package com.janbaskdemo.inheritance3;

public class BMW extends Car
{
    int numberOfWheel = 8;
 //   Cannot override a method with final keyword
//    @Override
//    public void stop() {
//        System.out.println("===BMW Stop===");
//    }

    @Override
    public void payment(int amount) {
        System.out.println("===BMW payment===" + amount);
    }

    public void payment(int carAge, int amount) {
        System.out.println("===BMW payment===" + amount + " Car Name: " + carAge);
    }
    @Override
    public void start() {
        System.out.println("===BMW Start===");
    }

    public  void autoParking()
    {
        System.out.println("===BMW AutoParking=====");
    }


    public  void isAutomatic()
    {
        System.out.println("===BMW Is Automatic=====");
    }

    public static void billing() {
        System.out.println("===BMW billing===");
    }

    //@Override -> Cannot override a static method
    public static void payment(String brandCompany) {
        System.out.println("===BMW payment===" + brandCompany);
    }

    @Override
    public  void engine()
    {
        System.out.println("=======BMW Engine=======");
    }
}
