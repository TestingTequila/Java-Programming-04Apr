package com.janbaskdemo.oops;

public class TestApplication
{
    public static void main(String[] args) {
        System.out.println("String[]");
        Application application = new Application();
        application.addition(12.34F, 67.8);
    }

    public static void main(String[] args, int i) {
        System.out.println("String/int");
        Application application = new Application();
        application.addition(12.34F, 67.8);
    }

    public static void main(int i) {
        System.out.println("int");
        Application application = new Application();
        application.addition(12.34F, 67.8);
    }

    public static void main(int i, char[] c) {
        System.out.println("char/int");
        Application application = new Application();
        application.addition(12.34F, 67.8);
    }
}
