package com.janbaskdemo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept
{
    public static void main(String[] args) {
//        ArrayList<String> subjects = new ArrayList<>();
        List<String> subjects = new ArrayList<>();
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

        System.out.println("==================Only Display Purpose============");
        System.out.println(subjects);

        System.out.println("==================Only Display Purpose in reverse order============");
        Collections.reverse(subjects);
        System.out.println(subjects);

        System.out.println("=====================================================");

        System.out.println("===================while loop=======================");
        int i1=0;
        while (i1<subjects.size())
        {
            System.out.println(subjects.get(i1));
            i1++;
        }

        System.out.println("===================for loop=======================");
        for(int i=0; i<subjects.size(); i++)
        {
            System.out.println(subjects.get(i));
        }
        System.out.println("=================Advanced for loop=========================");
        for(String subject: subjects)
        {
            System.out.println(subject);
        }


    }
}

//Order is maintained
//It can hold duplicate Values