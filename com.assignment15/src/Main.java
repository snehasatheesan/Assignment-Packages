package com.assignment15.university;

import com.assignment15.university.courses.Course;
import com.assignment15.university.faculty.Faculty;
import com.assignment15.university.students.Student;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Max");
        Student s2=new Student("Alex");

        Faculty f1=new Faculty("Jake");

        Course c1=new Course("Java",100);
        c1.addStudent(s1);
        c1.addStudent(s2);

        c1.setFaculty(f1);

        c1.getDetails();
    }
}
