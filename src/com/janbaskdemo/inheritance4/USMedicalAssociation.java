package com.janbaskdemo.inheritance4;

public interface USMedicalAssociation extends WHO, UHO
{
//    public USMedicalAssociation()
//    {
//        cannot create constructor in an interface
//    }

    String name = "Dr. Jason";
    public void cardioServices();
    public void neuroServices();
    public void physioServices();

    public static void taxCalculation()
    {
        System.out.println("USMedicalAssociation---tax Calculation");
    }

    default void getMedicalServices()
    {
        System.out.println("USMedicalAssociation---tax Calculation");
    }

}
