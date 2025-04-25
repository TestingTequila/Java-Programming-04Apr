package com.janbaskdemo.methodsConcepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMethods3
{
    public static void main(String[] args) {
        Marks marks = new Marks();
        int studentsMark=marks.getMarks("Rosie");
        System.out.println("The marks scored is: " + studentsMark);
        System.out.println(marks.getMarks("Tony"));

        System.out.println("========================BROWSER================");

        Browser browser = new Browser();
        String browserName=browser.launchBrowser("Edge");
        System.out.println("Launching the browser : " + browserName);

        System.out.println(browser.launchBrowser("Firefox"));

        System.out.println("======================DEVICES================");
        Devices devices = new Devices();
        String[] myDevices=devices.getDevices("Kerrie");
        System.out.println(Arrays.toString(myDevices));

        System.out.println("=======================EMP DETAILS=============");
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setFName("Jason");
        System.out.println(employeeDetails.getFName());
        employeeDetails.setLName("Roger");
        System.out.println(employeeDetails.getLName());
    }
}
