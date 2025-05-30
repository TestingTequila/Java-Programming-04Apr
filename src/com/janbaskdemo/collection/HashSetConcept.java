package com.janbaskdemo.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept
{
    public static void main(String[] args) {
//        HashSet<String> subjects = new HashSet<>();
        Set<String> subjects = new HashSet<>();
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


//Order is not maintained
//This does not hold duplicate values