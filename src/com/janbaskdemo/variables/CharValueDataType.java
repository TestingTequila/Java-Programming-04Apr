package com.janbaskdemo.variables;

public class CharValueDataType {
    public static void main(String[] args) {
        //char [2 byte][a-z, A-Z, 1-9, !@#$%^&*()-_+=]
        char c1 = 'a';
        char c2 = 'b';
        char c3 = '@';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1+c2);//97+98 =195
        System.out.println(c1+c2+c3);// 97+98+64
        System.out.println(c1-c2 +c3);//63

        System.out.println((int)'a');//97
        System.out.println((char)97);//a

        char c4 = 1; // Give me the char associated with number 1
        System.out.println(c4);

        byte i1 = 'a'; // Give me the number associated with char a
        System.out.println(i1);

        System.out.println("------------------Questions------------------");
        char c5 = 'a';
        char c6 = 'b';
        char c7 = 30;
        int i2 = 'c';
        System.out.println(c7);//NUL
        System.out.println(c5);//a
        System.out.println(i2);//99
        System.out.println(c7+c5); //1 + 97 = 98
        System.out.println(c7+i2); //1 + 99 = 100

        System.out.println("===============================================");
        System.out.println(c5+c6);//195
        System.out.println(c5 + c7); //98
        System.out.println(c7+c5); //98
        //System.out.println(c7+i2);//1+ 99
        System.out.println((int)c5+ c6); //195
        System.out.println(3+c5);
        System.out.println('3'+c5); //51+97




    }
}
