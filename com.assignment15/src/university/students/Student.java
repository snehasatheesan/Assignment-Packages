package com.assignment15.university.students;

public class Student {
    private String name;
    private static int rollNo=100;
    public Student(String name){
        this.name=name;
        rollNo++;
    }

    public String getName() {
        return name;
    }

    public static int getRollNo() {
        return rollNo;
    }
}
