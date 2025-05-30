package com.janbaskdemo.arrays;

import java.util.Arrays;

public class ArraysConcepts {
    public static void main(String[] args) {
        //12,14,17,65,68
//
//        int x1 =12;
//        int x2=14;
//        int x3=17;
//        int x4=65;
//        int x5=86;
//        int x =20;
//        System.out.println(x);
        int[] numbers = {12, 14, 17, 65, 68, 98, 96, 33, 22, 432};

        System.out.println("======Handling Arrays Using WHILE LOOP======");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);//12, 14,17, 56, 68
            i++;
        }

        System.out.println("======Handling Arrays Using FOR LOOP======");

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);//12, 14,17, 56, 68
        }

        System.out.println("======Handling Arrays Using ADVANCE FOR LOOP======");
        for (int num : numbers) {
            System.out.println(num);//12, 14...
        }

        System.out.println("======Printing Arrays Using toString========");
        System.out.println(Arrays.toString(numbers));

        System.out.println("===============NAMES ARRAY====================");

        String[] names = {"Jason", "Kerrie", "John", "Mary", "Sakshi", "Pavani"};
        System.out.println("======Handling Arrays Using WHILE LOOP======");
        int k = 0;
        while (k < names.length) {
            System.out.println(names[k]);
            k++;
        }

        System.out.println("======Handling Arrays Using FOR LOOP======");

        for (int l = 0; l < names.length; l++) {
            System.out.println(names[l]);
        }

        System.out.println("======Handling Arrays Using ADVANCE FOR LOOP======");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("======Printing Arrays Using toString========");
        System.out.println(Arrays.toString(names));

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("================================================");

//        int[] marks = {12, 34, 56, 32, 76, 98, 100};
//        for (int j = 0; j <= marks.length; j++) {
//            System.out.println(marks[j]);
//        }

        String[] subject = new String[4];
        subject[0] = "Maths";
        subject[1] = "Physics";
        subject[2] = "Chemistry";
        subject[3] = "Biology";
        subject[4] = "Computers";


    }
}
//System.out.println(numbers.length);//5 [nameOfArray.length]