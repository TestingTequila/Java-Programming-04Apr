package com.janbaskdemo.thisKeyword;

public class A
{
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public  A(int number, String name)
    {
        this.number =number;
        this.name = name;
    }
    public  void setNumber(int number)
    {
        this.number = number;
    }

    public  void  setName(String name)
    {
        this.name = name;
    }
}
