package com.yuriybishel.program;

import com.yuriybishel.model.Plant;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plant A = new Plant();
        Plant B = new Plant("Cactus", "green");
        Plant C = new Plant("Oak", "green", 10);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        String res = B.getName();
        System.out.println(res);
        B.changeStem(100);
        System.out.println(B);
    }
}