package com.janbaskdemo.statements;

public class SwitchStatement
{
    public static void main(String[] args) {

        String browserName= "ABC";
        switch (browserName)
        {
            case "IE":
                System.out.println("Execute your Test cases on IE Browser");
                break;
            case "Firefox":
                System.out.println("Execute your Test cases on Firefox Browser");
                break;
            case "Edge":
                System.out.println("Execute your Test cases on Edge Browser");
                break;
            case "Chrome":
                System.out.println("Execute your Test cases on Chrome Browser");
                break;
            default:
                System.out.println("Please provide a correct browser name....");
                break;
            case "Safari":
                System.out.println("Execute your Test cases on Safari Browser");
                break;
        }
    }
}


//Range values are not valid for switch statement, switch statement works only for exact matching values
//Will not work for range >, <, =>, =< etc
//dataTypes : byte, short, int, char, String
//We cannot use and operator

