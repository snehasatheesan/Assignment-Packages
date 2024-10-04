
package com.assignment15.university.faculty;

public class Faculty {
    private String name;
    private static int facultyId=2000;
    public Faculty(String name){
        this.name=name;
        facultyId++;
    }

    public String getName() {
        return name;
    }

    public static int getFacultyId() {
        return facultyId;
    }
}
