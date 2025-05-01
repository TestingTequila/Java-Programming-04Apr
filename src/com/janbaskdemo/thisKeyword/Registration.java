package com.janbaskdemo.thisKeyword;

public class Registration
{
    public Registration(String fName, String lName, int totalExp) {
        this(fName, lName);
        this.fName = "Kerrie";
        this.lName = "Wright";
        this.totalExp = totalExp;

    }

    public Registration(String fName, String lName, int age, int totalExp) {
        this(fName, lName, totalExp);
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.totalExp = totalExp;
    }

    public Registration(int age, int totalExp) {
        this.age = age;
        this.totalExp = totalExp;
    }

    String fName; //John
    String lName; //Lehman
    int age; //40
    int totalExp;//15

    public Registration(String fName, String lName)
    {
        this.fName = fName;
        this.lName= lName;
    }
}
