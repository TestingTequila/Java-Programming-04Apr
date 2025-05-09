package com.janbaskdemo.inheritance4;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{
    @Override
    public void getMedicalServices()
    {
        System.out.println("FortisHospital---getMedicalServices");
    }
    String name = "Dr. Joseph";
    @Override
    public void cardioServices() {
        System.out.println("FH---cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH---neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH---physioServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH---entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH---dentalServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("FH---oncologyServices");
    }

    @Override
    public void gynicServices() {
        System.out.println("FH---gynicServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("FH---orthoServices");
    }

    public void medicalTraining()
    {
        System.out.println("FH---medicalTraining");
    }

    @Override
    public void covidVaccination() {
        System.out.println("FH---covidVaccination");
    }

    @Override
    public void childCare() {
        System.out.println("FH---childCare");
    }
}
