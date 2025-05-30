package com.janbaskdemo.collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapConcept
{
    public static void main(String[] args) {
        TreeMap<String,Integer> phonebook = new TreeMap<>();
//        Map<String,Integer> phonebook = new HashMap<>();
        phonebook.put("Jason", 3243242);
        phonebook.put("Fatima", 546456);
        phonebook.put("Lily", 98797698);
        phonebook.put("Kerrie", 786786);
        phonebook.put("Rahul", 565464);
        phonebook.put("Roger", 546456);
        phonebook.put("Roger", 6575675);
        phonebook.put("Lee", 67867);
        phonebook.put("Ashish", 67867);
        System.out.println("====Display Purpose======");
        System.out.println(phonebook);

        System.out.println("===========Advanced For loop for Keys=======");

        for(String key: phonebook.keySet())
        {
            System.out.println(key);
        }

        System.out.println("===========Advanced For loop for Values=======");

        for(Integer value: phonebook.values())
        {
            System.out.println(value);
        }

        System.out.println("======To get Specific Value for a given key======");

        System.out.println(phonebook.get("Ashish"));

    }
}

//HashMap stores data as key value pair
//This will maintain the order as per the data type of map
//This will not hold the Duplicate Values