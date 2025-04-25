package com.janbaskdemo.methodsConcepts;

import java.util.Arrays;

public class TestMethods4
{
    public static void main(String[] args) {
        Marks1 marks1 = new Marks1();
        System.out.println(marks1.getMarks("Roger"));

        System.out.println("================BROWSER 2===============");
        Browser2 browser2 = new Browser2();
        System.out.println(browser2.launchBrowser("Chrome"));
        System.out.println("==============DEVICES=====================");
        Devices devices = new Devices();
        System.out.println(Arrays.toString(devices.getDevices("Kerrie")));
    }
}
