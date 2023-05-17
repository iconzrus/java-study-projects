package com.yuriybishel.program;

import com.yuriybishel.model.Student;

import java.util.Comparator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student a = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
        Student b = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
        Student c = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());

        if (a.compareTo(b) < 0) {
            System.out.println("a < b");
        }
        else if (a.compareTo(b) > 0) {
            System.out.println("a > b");
        }
        else System.out.println("a=b");

        Comparator<Student> studentsComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };
        if (studentsComparator.compare(a,b) < 0) {
            System.out.println(" a < b ");
        }
        else if (studentsComparator.compare(a,b) > 0) {
            System.out.println("a>b");
        }
        else System.out.println("a=b");
    }




}