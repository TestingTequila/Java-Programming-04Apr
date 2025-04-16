package com.janbaskdemo.variables;

public class DecimalValueDataTypes
{
    public static void main(String[] args)
    {
        //float: [4 byte --32 bits][up to 6 decimal places]
        float f1 =12.123456789012345F;
        System.out.println(f1);

        float f2 =(float)12.123456789012345;
        System.out.println(f2);

        //double [8 byte --64 bits [up to 15 decimal places]
        double d1 = 12.123456789012345;
        System.out.println(d1);
    }
}
