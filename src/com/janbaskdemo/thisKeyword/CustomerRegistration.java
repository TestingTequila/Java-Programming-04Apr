package com.janbaskdemo.thisKeyword;

public class CustomerRegistration
{
    private String fName;
    private String lName;

    public CustomerRegistration getfName() {
        System.out.println("getfName");
        return this;
    }

    public CustomerRegistration getlName() {
        System.out.println("getlName");
        return this;
    }

    public CustomerRegistration getAge() {
        System.out.println("getAge");
        return this;
    }

    public CustomerRegistration getTotalExp() {
        System.out.println("getTotalExp");
        return this;
    }

    public CustomerRegistration getIsIntoIT() {
        System.out.println("getIsIntoIT");
        return this;
    }

    public CustomerRegistration getGender() {
        System.out.println("getIsIntoIT");
        return this;
    }

    private int age;
    private int totalExp;
    boolean isIntoIT;
    char gender;

   public CustomerRegistration(String fName, String lName, int age, int totalExp, boolean isIntoIT, char gender)
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
