package com.janbaskdemo.stringmanipulation;

public class StringManipulation
{
    public static void main(String[] args) {
        String str="Hi This is my Java Code";
        System.out.println(str.length());
        System.out.println(str.indexOf('H'));//0
        System.out.println(str.indexOf('e'));//22
        System.out.println(str.charAt(3));//T
        System.out.println(str.charAt(8));//i
        System.out.println(str.charAt(7));//space

        String classStatusMessage = "Class started Unsuccessfully";
        System.out.println(classStatusMessage.indexOf('S'));
        System.out.println(classStatusMessage.contains("Successful"));

        if(classStatusMessage.indexOf('S')==14)
        {
            System.out.println("Class has started...");
        }
        else
        {
            System.out.println("Class has not started yet....");
        }

        System.out.println("=====trim()=======================");
        String p = "  Hello World  ";
        System.out.println(p);
        System.out.println(p.trim());
        System.out.println(p.replace(" ", ""));

        System.out.println("======replace()========");

        String  statement = "I love partying on Weekends";
        System.out.println(statement.replace("partying", "working"));

        String dob= "25/12/1994";
        System.out.println(dob.replace("/", "-"));

        System.out.println("======equals()================");
        String s1 = "This is Selenium Course";
        String s2 = "This is selenium Course";
        System.out.println(s1.equals(s2));//true or false

        System.out.println("======contains()======================");

        String pageTitle = "JanBask Training - Trainer Dashboard";
        System.out.println(pageTitle.contains("Student"));

        System.out.println("==================split()===============");

        String thoughtOfTheDay = "If you have attitude and aptitude you will achieve altitude";
        System.out.println(thoughtOfTheDay.length()); //45

        String[] myWords=thoughtOfTheDay.split(" ");
        System.out.println(myWords.length); //10

    }
}
