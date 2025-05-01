package com.janbaskdemo.thisKeyword;

public class TestCustomerRegistration2 {
    public static void main(String[] args) {
        CustomerRegistration2 cr2 = new CustomerRegistration2("Ashish", "Mishra", 32, 7, false, 'M');
        cr2.setfName("Nancy").setGender('F').setIntoIT(true);// updating

        System.out.println("=============Setting Value through Constructor=================");
        System.out.println(cr2.getfName());//Ashish
        System.out.println(cr2.getlName());//Mishra
        System.out.println(cr2.getAge());//32
        System.out.println(cr2.getTotalExp());//7
        System.out.println(cr2.getIsIntoIT());//false
        System.out.println(cr2.getGender());//M

        System.out.println("=============Updating Multiple Values through Builder Pattern=================");
        cr2.setfName("Nancy").setGender('F').setIntoIT(true);
        System.out.println(cr2.getfName());//Nancy
        System.out.println(cr2.getlName());//Mishra
        System.out.println(cr2.getAge());//32
        System.out.println(cr2.getTotalExp());//7
        System.out.println(cr2.getIsIntoIT());//true
        System.out.println(cr2.getGender());// 'F'

        System.out.println("===========Setting and updating the value together==============");
        CustomerRegistration2 cr3 = new CustomerRegistration2("Ashish", "Mishra", 32, 7, false, 'M')
                                   .setlName("Mehra").setTotalExp(12); //Setting and Updating together

        System.out.println(cr3.getfName());//Ashish
        System.out.println(cr3.getlName());//Mehra
        System.out.println(cr3.getAge());//32
        System.out.println(cr3.getTotalExp());//12
        System.out.println(cr3.getIsIntoIT());//true
        System.out.println(cr3.getGender());// 'F'
    }
}
