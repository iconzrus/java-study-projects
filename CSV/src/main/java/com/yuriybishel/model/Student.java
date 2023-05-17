package com.yuriybishel.model;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String firstName, String lastName, int grade, Grades grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.grades = grades;
    }
}
