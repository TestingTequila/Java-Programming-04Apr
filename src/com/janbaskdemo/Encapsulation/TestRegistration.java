package com.janbaskdemo.Encapsulation;

public class TestRegistration
{
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setfName("Tony");
        registration.setlName("Hill");
        registration.setEmailId("tony.hill@janbask.com");
        registration.setTelephone("565465");
        registration.setTotalExperience(12);

        System.out.println(registration.getfName()+", " + registration.getlName() + ", "+ registration.getEmailId() +", "+ registration.getTelephone()+ ", "+ registration.getTotalExperience());

        System.out.println("========Setting through Constructor========================");
        Registration2 registration2 = new Registration2("Peter", "Lance", "peter.lance@janbask.com", "567567", 15);
        System.out.println(registration2.getfName()+", " + registration2.getlName() + ", "+ registration2.getEmailId() +", "+ registration2.getTelephone()+ ", "+ registration2.getTotalExperience());

        System.out.println("========Setting through Constructor and updating using setter========================");
        Registration3 registration3 = new Registration3("Rosy", "Diana", "rosy.diana@janbask.com", "78876", 3);
        System.out.println(registration3.getfName()+", " + registration3.getlName() + ", "+ registration3.getEmailId() +", "+ registration3.getTelephone()+ ", "+ registration3.getTotalExperience());
        registration3.setTelephone("11122233");
        System.out.println(registration3.getfName()+", " + registration3.getlName() + ", "+ registration3.getEmailId() +", "+ registration3.getTelephone()+ ", "+ registration3.getTotalExperience());

    }
}
