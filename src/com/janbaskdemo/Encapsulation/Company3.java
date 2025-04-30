package com.janbaskdemo.Encapsulation;

public class Company3 {

    public Company3(String name, int empCount, int sharePrice  )
    {
        this.name = name;
        this.empCount = empCount;
        this.sharePrice = sharePrice;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
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
