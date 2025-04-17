package com.janbaskdemo.stringsmath;

public class PostDecrementOperator
{
    //first assignment and then decrement happens
    public static void main(String[] args) {
        int a =1;
        int b =a--;
        System.out.println(a);//0
        System.out.println(b);//1

        int c = -99;
        int d =c--;
        System.out.println(c);//-100
        System.out.println(d);//-99

        int e = 199;
        int f = e--;
        System.out.println(e);//198
        System.out.println(f);//199

    }
}
