package com.janbaskdemo.Encapsulation;

public class Company2 {

    public Company2(String name,int empCount,int sharePrice  )
    {
        this.name = name;
        this.empCount = empCount;
        this.sharePrice = sharePrice;
    }
    private String name;

    public String getName() {
        return name;
    }

    public int getEmpCount() {
        return empCount;
    }

    public int getSharePrice() {
        return sharePrice;
    }


    private int empCount;
    private int sharePrice;


}
