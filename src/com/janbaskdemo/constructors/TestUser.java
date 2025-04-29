package com.janbaskdemo.constructors;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("Ritu", 29); //Call the constructor with String and int parameter
        System.out.println(u1.name);//Ritu
        System.out.println(u1.age);//29
        System.out.println(u1.email);
        System.out.println(u1.password);
        System.out.println(u1.phone);

        System.out.println("========================================");
        User u2 = new User("ashish@gmail.com", "test@1234", "4353453");
        System.out.println(u2.name);//null
        System.out.println(u2.age);//0
        System.out.println(u2.email);
        System.out.println(u2.password);
        System.out.println(u2.phone);

        System.out.println("========================================");
        User u3 = new User("Ashish", 29, "ashish.m@gmail.com", "test@12345", "675675");
        System.out.println(u3.name);//
        System.out.println(u3.age);
        System.out.println(u3.email);
        System.out.println(u3.password);
        System.out.println(u3.phone);
    }
}
