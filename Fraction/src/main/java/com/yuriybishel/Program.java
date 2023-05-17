package com.yuriybishel;

import com.model.Fraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Fraction x = new Fraction(1, 5);
            String s = x.toString();
            System.out.println(s);
            Fraction x1 = new Fraction(5, 25);
            int i = x1.compareTo(x);
            System.out.println(i);
            Fraction sum = x1.sum(1);
            System.out.println(sum);
            double sum1 = x1.sum(3.14);
            System.out.println(sum1);
            Fraction a = new Fraction(1, 2);
            Fraction a1 = new Fraction(1, 3);
            Fraction a2 = new Fraction(1, 4);
            Fraction a3 = new Fraction(1, 5);
            Fraction a4 = new Fraction(1, 6);
            Fraction[] res = {a2, a1, a4, a, a3};
            System.out.println(Arrays.toString(res));
            Arrays.sort(res);
            System.out.println(Arrays.toString(res));
            Arrays.sort(res, Comparator.reverseOrder());
            System.out.println(Arrays.toString(res));
            Fraction z = new Fraction(1, 0);
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
