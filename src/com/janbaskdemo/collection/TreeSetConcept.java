package com.janbaskdemo.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept
{
    public static void main(String[] args) {
        //TreeSet<String> subjects = new TreeSet<>();
        Set<String> subjects = new TreeSet<>();
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Computers");
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C#");
        subjects.add("AI");
        subjects.add("DS");
        subjects.add("Geography");
        subjects.add("Geography");

        System.out.println("=============Display Purpose=======");
        System.out.println(subjects);
        System.out.println("=============Advanced For Loop=======");
        for(String subject: subjects)
        {
            System.out.println(subject);
        }
    }
}


//Order is maintained depending upon the data type
//This does not hold duplicate values