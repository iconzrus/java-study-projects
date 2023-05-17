package com.yuriybishel.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class IntegersRepository {
    private ArrayList<Integer> integers = new ArrayList<>();

    public IntegersRepository() {
    }

    public IntegersRepository(String filePath) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] numberStrings = line.split(" ");
                for (String numberString : numberStrings) {
                    if (!numberString.isEmpty()) {
                        integers.add(Integer.valueOf(numberString));
                    }
                }
            }
        }
    }

    public void save(String filePath) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (Integer integer : integers) {
                bufferedWriter.write(String.valueOf(integer));
                bufferedWriter.newLine();
            }
        }
    }

    public int countMax() {
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < integers.size() - 1; i++) {
            if (integers.get(i).equals(integers.get(i + 1))) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxCount;
    }

    public void add(String a) {
        integers.add(Integer.valueOf(a));
    }

    public static boolean isEqualNumber(int a){
        String x = String.valueOf(a);
        for (int i = 0; i < x.length() - 1; i++) {
            if (x.charAt(i) != x.charAt(i+1)) {
               return false;
            }
        }
        return true;
    }

    public void removeEquals(){
        ArrayList<Integer> deleted = new ArrayList<>();
        for (Integer integer : this.integers) {
            if(isEqualNumber(integer)){
                deleted.add(integer);
            }
        }
        this.integers.removeAll(deleted);
    }

    @Override
    public String toString() {
        return "IntegersRepository{" +
                "integers=" + integers +
                '}';
    }
}
