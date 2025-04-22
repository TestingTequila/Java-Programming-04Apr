package com.janbaskdemo.classAndobjects;

import java.util.Random;

public class TestResume {
    public static void main(String[] args) {
        ResumeTemplate emp1 = new ResumeTemplate();
        emp1.fName = "Roberto";
        emp1.lName = "Lincoln";
        emp1.totalExp = 4.7;
        emp1.gender = 'M';
        emp1.isMarried = false;
        System.out.println("Emp1: "+emp1.fName + ", " + emp1.lName + ", " + emp1.totalExp + ", " + emp1.gender+", "+ emp1.isMarried );


        ResumeTemplate emp2 = new ResumeTemplate();
        emp2.fName = "Irene";
        emp2.lName = "Hill";
        emp2.gender = 'F';
        emp2.totalExp = 3;
        emp2.isMarried = false;

        System.out.println("Emp2: "+emp2.fName + ", " + emp2.lName + ", " + emp2.totalExp + ", " + emp2.gender+", "+ emp2.isMarried );


        ResumeTemplate emp3 = new ResumeTemplate();
        emp3.fName = "Kerrie";
        emp3.lName = "Wright";
        emp3.gender = 'F';
        emp3.totalExp = 10.3;
        emp3.isMarried = true;
        System.out.println("Emp3: "+emp3.fName + ", " + emp3.lName + ", " + emp3.totalExp + ", " + emp3.gender+", "+ emp3.isMarried );

        //1. Creating Object without Reference Variable
        new ResumeTemplate().fName = "John";
        new ResumeTemplate().lName= "Roger";
        new ResumeTemplate().totalExp =5;
        new ResumeTemplate().gender = 'M';
        new ResumeTemplate().isMarried= false;

        //2. Object pointing to null;
        //emp3 = null; //emp3 has broken its original connection and is pointing where null is pointing
        //System.out.println("Emp3: "+emp3.fName + ", " + emp3.lName + ", " + emp3.totalExp + ", " + emp3.gender+", "+ emp3.isMarried );

        emp3 = emp2;
        System.out.println("Emp3: "+emp3.fName + ", " + emp3.lName + ", " + emp3.totalExp + ", " + emp3.gender+", "+ emp3.isMarried );

        System.gc();


    }
}
