package com.janbaskdemo.methodsConcepts;

public class Marks
{
    public int getMarks(String nameOfStudent)
    {
        if(nameOfStudent.equals("Jason"))
        {
            return 90;
        }
        else if (nameOfStudent.equals("Roger"))
        {
            return 92;
        }
        else if (nameOfStudent.equals("Lee"))
        {
            return 64;
        }
        else if (nameOfStudent.equals("Kerrie"))
        {
            return 80;
        }
        else if (nameOfStudent.equals("Tony"))
        {
            return 100;
        }
        return -1;
    }
}
