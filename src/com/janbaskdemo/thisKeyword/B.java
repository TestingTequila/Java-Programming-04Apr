package com.janbaskdemo.thisKeyword;

public class B
{
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public B(int number, String name)
    {
        this.number =number;
        this.name = name;
        this.setNumber(900);
    }
    public  void setNumber(int number)
    {
       // this(100, "Jason"); You cannot call a constructor inside of a method
        this.setName("Jason");
        this.number = number;
    }

    public  void  setName(String name)
    {
        this.name = name;
    }
}
