package com.yuriybishel.repository;

import com.yuriybishel.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentsRepository {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentsRepository() {
    }

    public StudentsRepository(String fileName) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(";");
                new Student(split[0],split[2],Integer.parseInt(split[3]), new Grades(Integer.parseInt(split[4]),
                        Integer.parseInt(split[5]),Integer.parseInt(split[6]),Integer.parseInt(split[7])));

            }

        } catch (RuntimeException ignored) {
        }
    }
}

