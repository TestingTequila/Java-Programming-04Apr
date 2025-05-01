package com.janbaskdemo.thisKeyword;

public class CustomerRegistration2
{
    private String fName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public boolean getIsIntoIT() {
        return isIntoIT;
    }

    public char getGender() {
        return gender;
    }

    private String lName;


    private int age;
    private int totalExp;
    boolean isIntoIT;
    char gender;

    public CustomerRegistration2 setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public CustomerRegistration2 setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public CustomerRegistration2 setAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerRegistration2 setTotalExp(int totalExp) {
        this.totalExp = totalExp;
        return this;
    }

    public CustomerRegistration2 setIntoIT(boolean intoIT) {
        isIntoIT = intoIT;
        return this;
    }

    public CustomerRegistration2 setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public CustomerRegistration2(String fName, String lName, int age, int totalExp, boolean isIntoIT, char gender)
    {
        System.out.println("This is my parametrized Constructor....");
        this.fName = fName;
        this.lName=lName;
        this.age=age;
        this.totalExp= totalExp;
        this.isIntoIT= isIntoIT;
        this.gender= gender;
    }


}
