package com.janbaskdemo.classAndobjects;

public class TestUsers {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.name = "Roberto";
        u1.age = 29;
        u1.city = "NY";

        Users u2 = new Users();
        u2.name = "Irene";
        u2.age = 26;
        u2.city = "London";

        Users u3 = new Users();
        u3.name = "Ashish";
        u3.age = 30;
        u3.city = "Delhi";

        System.out.println("u1 Details: "+u1.name + ", " + u1.age + ", " + u1.city);
        System.out.println("u2 Details: "+u2.name + ", " + u2.age + ", " + u2.city);
        System.out.println("u3 Details: "+u3.name + ", " + u3.age + ", " + u3.city);

        System.out.println("======================(u1=u2)======================");

        u1=u2; //u1 has broken its connection and is pointing where u2 is pointing
        System.out.println("u1 Details: "+u1.name + ", " + u1.age + ", " + u1.city);
        System.out.println("u2 Details: "+u2.name + ", " + u2.age + ", " + u2.city);
        System.out.println("u3 Details: "+u3.name + ", " + u3.age + ", " + u3.city);

        System.out.println("======================(u2=u3)======================");

        u2=u3; //u2 has broken its connection and is pointing where u3 is pointing
        System.out.println("u1 Details: "+u1.name + ", " + u1.age + ", " + u1.city);
        System.out.println("u2 Details: "+u2.name + ", " + u2.age + ", " + u2.city);
        System.out.println("u3 Details: "+u3.name + ", " + u3.age + ", " + u3.city);

        System.out.println("======================(u3=u1)======================");

        u3=u1; //u3 has broken its connection and is pointing where u1 is pointing
        System.out.println("u1 Details: "+u1.name + ", " + u1.age + ", " + u1.city);//Irene
        System.out.println("u2 Details: "+u2.name + ", " + u2.age + ", " + u2.city);//Ashish
        System.out.println("u3 Details: "+u3.name + ", " + u3.age + ", " + u3.city);//Irene

        System.out.println("======================(u1=u2=u3)======================");

        u1=u2=u3;
        System.out.println("u1 Details: "+u1.name + ", " + u1.age + ", " + u1.city);//Irene
        System.out.println("u2 Details: "+u2.name + ", " + u2.age + ", " + u2.city);//Irene
        System.out.println("u3 Details: "+u3.name + ", " + u3.age + ", " + u3.city);//Irene


    }
}
