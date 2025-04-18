package com.janbaskdemo.statements;

public class SwitchStatement2
{
    public static void main(String[] args) {

        String dayOfTheWeek= "Saturday";
        switch (dayOfTheWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("I have to go to Office......");
                break;
            default:
                System.out.println("Its Weekend ...lets Party....");
                break;
        }
    }
}


//Range values are not valid for switch statement, switch statement works only for exact matching values
//Will not work for range >, <, =>, =< etc
//dataTypes : byte, short, int, char, String
//We cannot use and operator

