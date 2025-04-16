package com.janbaskdemo.variables;

public class IntegerValueDataTypes
{
    public static void main(String[] args) {
        System.out.println("=====================byte========================");
        //byte -- 1 byte[8 bits] [-128 to 127]
        byte b1 =-128;
        byte b2 = 127;
        byte b3 = 10;
        System.out.println(b1);//-128
        System.out.println(b2);//127
        System.out.println(b3);//10
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        System.out.println("=====================short========================");
        //short -- 2 byte[16 bits][-32768 to 32767]
        short s1 = 128;
        short s2 = 32767;
        short s3 = -32768;
        short s4 = 10;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("=====================int========================");
        //int  -- 4 byte [32 bits][-2147483648 to 2147483647]
        int i1 = -2147483648;
        int i2 = 2147483647;
        int i3 = 10;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("=====================long========================");
        //long --8 byte [64 bits][-9223372036854775808 to 9223372036854775807]
        long l1 = 2147483648L;
        long l2 = -2147483649L;
        long l3 = -10L;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("----------------Question------------------------");
        //10, 100

        //12, 8
        int x=128;
        int y=127;
        int sum =x+y;

        System.out.println(sum);

        int s= 23767;
        int product = s*10;
        System.out.println(product);

        short myAge = 29;
        System.out.println(myAge);







    }
}
