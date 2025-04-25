package com.janbaskdemo.methodsConcepts;

public class Marks1
{
    public int getMarks(String nameOfStudent)
    {
        int myMarks=-1;
        if(nameOfStudent.equals("Jason"))
        {
            myMarks= 90;
        }
        else if (nameOfStudent.equals("Roger"))
        {
            myMarks= 92;
        }
        else if (nameOfStudent.equals("Lee"))
        {
            myMarks= 64;
        }
        else if (nameOfStudent.equals("Kerrie"))
        {
            myMarks= 80;
        }
        else if (nameOfStudent.equals("Tony"))
        {
            myMarks= 100;
        }
        return myMarks;
    }
}
