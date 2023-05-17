package com.yuriybishel.util;

public class Util {
    /**
     * Max of two numbers
     *
     * @param a integer number
     * @param b integer number
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c, int d) {
        return Util.max((Util.max(a, b)), Util.max(c, d));
    }

    /**
     * Define if number is prime
     *
     * @param n integer number
     */
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    /**
     * Print all prime numbers in [a,b]
     *
     * @param a integer number
     * @param b integer number
     */
    public static void primerow(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (Util.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * a to n power
     *
     * @param a double number
     * @param b integer number
     */
    public static double power(double a, int b) {
        double res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    /**
     * Define if a number is even
     *
     * @param a integer number
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /**
     * Print all even numbers in [a, b]
     *
     * @param a integer number
     * @param b integer number
     */

    public static void printEven(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (Util.isEven(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Define if a number is perfect
     *
     * @param a integer number
     */
    public static boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum == a;
    }

    /**
     * Print all perfect number in [a,b]
     *
     * @param a integer number
     * @param b integer number
     */

    public static void printPerfect(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (Util.isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Define next prime number
     *
     * @param a integer number
     */
    public static void nextPrime(int a) {
        for (int i = a; i < Integer.MAX_VALUE; i++) {
            if (Util.isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * Define first n prime numbers
     *
     * @param a integer number
     */
    public static String firstPrime(int a) {
        String res = "";
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE && count < a; i++) {
            if (Util.isPrime(i)) {
                res += i + " ";
                count++;
            }
        }
        return res;
    }
}