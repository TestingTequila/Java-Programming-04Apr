package com.janbaskdemo.stringsmath;

public class IncrementDecrementMiscQuestion
{
    public static void main(String[] args) {

        int m = 200;
        int n = m++;
        System.out.println(m);//201
        System.out.println(n);//200
        System.out.println(--m);//200
        System.out.println(m);//200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199

    }
}
