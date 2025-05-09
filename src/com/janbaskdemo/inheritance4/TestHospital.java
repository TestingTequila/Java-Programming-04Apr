package com.janbaskdemo.inheritance4;

public class TestHospital {
    public static void main(String[] args) {

        System.out.println("====Normal Object of Fortis Hospital========");
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();//USMedicalAssociation Interface
        fh.neuroServices();//USMedicalAssociation Interface
        fh.physioServices();//USMedicalAssociation Interface
        fh.entServices();//UKMedicalAssociation Interface
        fh.dentalServices();//UKMedicalAssociation Interface
        fh.oncologyServices();//IndianMedicalAssociation Interface
        fh.gynicServices();//IndianMedicalAssociation Interface
        fh.orthoServices();//IndianMedicalAssociation Interface
        fh.medicalTraining();//SelfService
        fh.medicalRnD(); //Hospital Class
        fh.medicalNews();//Hospital Class
        fh.roboticOperations();//Hospital 3
        //fh.taxCalculation(); Static method of an interface cannot be inherited
        fh.getMedicalServices();

        System.out.println("=====TOP CASTING: USMedicalAssociation================");
        USMedicalAssociation usma= new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();
        USMedicalAssociation.taxCalculation();
        usma.getMedicalServices();
        System.out.println(USMedicalAssociation.name);
        System.out.println("=====TOP CASTING: UKMedicalAssociation================");
        UKMedicalAssociation ukma =new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();

        System.out.println("=====TOP CASTING: IndianMedicalAssociation================");
        IndianMedicalAssociation ima =new FortisHospital();
        ima.oncologyServices();
        ima.gynicServices();
        ima.orthoServices();

//        CANNOT CREATE OBJECT OF AN INTERFACE
//        USMedicalAssociation usma1 = new USMedicalAssociation();
//        UKMedicalAssociation usma1 = new UKMedicalAssociation();
//        IndianMedicalAssociation usma1 = new IndianMedicalAssociation();
//
//        FortisHospital fh1=new USMedicalAssociation();
//        FortisHospital fh1=new UKMedicalAssociation();
//        FortisHospital fh1=new IndianMedicalAssociation();

        //CANNOT CREATE OBJECT OF AN ABSTRACT CLASS

         //C1 c1 = new C1();//

        System.out.println(fh.name);
        System.out.println(USMedicalAssociation.name);
//        USMedicalAssociation.name = "Dr. Rohit";

    }
}
