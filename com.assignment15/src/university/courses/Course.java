package com.assignment15.university.courses;

import com.assignment15.university.faculty.Faculty;
import com.assignment15.university.students.Student;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int studentCount;
    private ArrayList<Student> students;
    private ArrayList<Faculty> faculties;

    public Course(String courseName,int studentCount){
        this.courseName=courseName;
        this.studentCount=studentCount;
        this.students=new ArrayList<>();
        this.faculties=new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void addStudent(Student s){
        if (students.size()==studentCount){
            System.out.println("No seats available");
            return;
        }
        students.add(s);
    }
    public void setFaculty(Faculty f){
        faculties.add(f);
    }

    public void getDetails(){
        System.out.println("Course name: "+this.courseName);
        System.out.println("Max Students count: "+this.studentCount);
        System.out.println("Current student count: "+this.students.size());
        System.out.println("Current students:");
        for(Student s:this.students){
            System.out.println(s.getName());
        }
        System.out.println("Faculties:");
        for (Faculty f:this.faculties){
            System.out.println(f.getName());
        }
    }
}
