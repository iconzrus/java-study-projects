package com.yuriybishel.program;

import java.io.IOException;

import com.yuriybishel.repository.IntegersRepository;

public class Program {
    public static void main(String[] args) {
        try {
            IntegersRepository repository = new IntegersRepository("integers.txt");
            System.out.println(repository);
            repository.removeEquals();
            System.out.println(repository);
            int i = repository.countMax();
            System.out.println(i);
            repository.save("output.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        boolean equalNumber = IntegersRepository.isEqualNumber(2223);
        System.out.println(equalNumber);


    }
}