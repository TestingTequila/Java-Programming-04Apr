package com.janbaskdemo.Encapsulation;

public class Company {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    private int empCount;
    private int sharePrice;


}
