package com.janbaskdemo.Encapsulation;

public class Registration2
{
    public Registration2(String fName, String lName, String emailId, String telephone, int totalExperience) {
        this.fName = fName;
        this.lName = lName;
        this.emailId = emailId;
        this.telephone = telephone;
        this.totalExperience = totalExperience;
    }

    String fName;
    String lName;

    String emailId;
    String telephone;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getTotalExperience() {
        return totalExperience;
    }


    int totalExperience;

}
