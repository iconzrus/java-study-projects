package com.yuriybishel.program;

import com.yuriybishel.repository.StudentsRepository;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        StudentsRepository repository = new StudentsRepository("students.csv");
        System.out.println(repository);

    }
}