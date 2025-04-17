package com.janbaskdemo.stringsmath;

public class PostIncrementOperator
{
    //first assignment and then increment happens
    public static void main(String[] args) {
        int a =1;
        int b =a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int c = -99;
        int d =c++;
        System.out.println(c);//-98
        System.out.println(d);//-99

        int e = 199;
        int f = e++;
        System.out.println(e);//200
        System.out.println(f);//199

    }
}
