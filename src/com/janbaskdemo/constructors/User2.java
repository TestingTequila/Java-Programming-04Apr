package com.janbaskdemo.constructors;

public class User2 {
    String name;
    int age;
    String email;
    String password;

    public User2(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public User2(String name, int age, String email, String password, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public User2(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String phone;

    static String companyName;
}
