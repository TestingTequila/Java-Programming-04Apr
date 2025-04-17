package com.janbaskdemo.stringsmath;

public class PreDecrementOperator
{
    //first increment happens and then assignment happens
    public static void main(String[] args) {
        int a =1;
        int b =--a;
        System.out.println(a);//0
        System.out.println(b);//0

        int c = -99;
        int d =--c;
        System.out.println(c);//-100
        System.out.println(d);//-100

        int e = 199;
        int f = --e;
        System.out.println(e);//198
        System.out.println(f);//198

    }
}
