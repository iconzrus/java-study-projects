package com.yuriybishel.model;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int grade;
    private double rating;

    public Student() {
    }

    public Student(String firstName, String lastName, int grade, double rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Double.compare(student.rating, rating) == 0 && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grade, rating);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", rating=" + rating +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if (this.grade == o.grade) {
            return Double.compare(this.rating, o.rating);
        }
        return Integer.compare(this.grade, o.grade);
    }
}
