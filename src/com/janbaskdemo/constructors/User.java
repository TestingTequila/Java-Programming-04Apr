package com.janbaskdemo.constructors;

public class User {
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String email, String password, String phone) {
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public User(String name, int age, String email, String password, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    String name;
    int age;
    String email;
    String password;
    String phone;

    static String companyName;
}
