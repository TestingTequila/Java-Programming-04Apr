package com.janbaskdemo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept
{
    public static void main(String[] args) {
//        LinkedHashSet<String> subjects = new LinkedHashSet<>();
        Set<String> subjects = new LinkedHashSet<>();
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


//Order is maintained
//This does not hold duplicate values