package com.janbaskdemo.thisKeyword;

public class TestCustomerRegistration
{
    public static void main(String[] args) {
        CustomerRegistration customerRegistration = new CustomerRegistration("Lee", "Tenzan", 34,20 ,true, 'M' );
        System.out.println(customerRegistration.getfName());
        System.out.println(customerRegistration.getlName());
        System.out.println(customerRegistration.getAge());
        System.out.println(customerRegistration.getTotalExp());
        System.out.println(customerRegistration.getIsIntoIT());
        System.out.println(customerRegistration.getGender());

        customerRegistration.getfName().getlName().getGender().getIsIntoIT();

    }
}
