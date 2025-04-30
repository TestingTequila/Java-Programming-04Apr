package com.janbaskdemo.Encapsulation;

public class Registration3
{
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

    public Registration3(String fName, String lName, String emailId, String telephone, int totalExperience) {
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
