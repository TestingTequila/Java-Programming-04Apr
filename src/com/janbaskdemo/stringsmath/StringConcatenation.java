package com.janbaskdemo.stringsmath;

public class StringConcatenation {

    public static void main(String[] args) {
        String myName ="Ashish Mishra";
        System.out.println(myName);

        String statement ="We are learning Java";
        System.out.println(statement);

        System.out.println("===========String Concatenation================");

        String x = "hello";
        String y = "world";

        int a =100;
        int b =200;

        System.out.println(x); //hello
        System.out.println(y); //world
        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(a+b);//300

        System.out.println(x+y); //helloworld

        System.out.println(x+a);//hello100

        System.out.println(a+b+x+y);//300helloworld

        System.out.println(x+y+a+b); //helloworld100200

        System.out.println(x+y+a+b+x+y);//helloworld100200helloworld
        System.out.println(x+y+(a+b)); //helloworld300
        System.out.println(x+y+(a+b)+x+y); //helloworld300helloworld
        System.out.println(x + a*b); //hello20000
        System.out.println(x + b/a); // hello2
        //System.out.println((x + b)/a); // Compile time Error




    }
}
