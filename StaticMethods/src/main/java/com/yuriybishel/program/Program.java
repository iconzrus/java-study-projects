package com.yuriybishel.program;

import com.yuriybishel.util.Util;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Вычислить наибольшее значение из двух целых чисел
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Util.max(a,b);
        System.out.println(max);*/

        /**
         * Вычислить наибольшее значение из четырёх целых чисел.
         * Не использовать if, а вызывать метод из прошлой задачи 3 раза
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max1 = Util.max(a, b,c,d);
        System.out.println(max1);*/


        /**
         *⦁	Вернуть true, если переданное число является простым, или false, если непростым.
         * В качестве типа возвращаемого значения использовать boolean.
         * Простое число - это число, у которого только два делителя
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean res = Util.isPrime(n);
        System.out.println(res);*/

        /**
         * ⦁Вывести на экран все простые числа на диапазоне от а до b. Для проверки простоты использовать прошлый метод
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Methods.primerow(a,b);*/

        /**
         * ⦁	По дробному а и целому неотрицательному n вычислить значение а в степени n.
         */
        /*Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = scanner.nextInt();
        double res = Util.power(a,b);
        System.out.println(res);*/

        /**
         * Проверить, является ли переданное число четным числом
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean res = Util.isEven(a);
        System.out.println(res);*/

        /**
         * Вывести на экран только четные числа на отрезке от а до b
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Util.printEven(a,b);*/

        /**
         * Проверить, является ли переданное число совершенным. Совершенное число – число,
         * равное сумме своих делителей без учета последнего числа
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean res = Util.isPerfect(a);
        System.out.println(res);*/

        /**
         * В виде строки вернуть все совершенные числа на диапазоне от а до b
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Util.printPerfect(a,b);*/

        /**
         * Вычислить следующее за переданным числом простое число.
         * Для проверки простоты использовать ранее реализованный метод
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Util.nextPrime(a);*/

        /**
         * Вернуть в виде строки первые n простых чисел
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = Util.firstPrime(n);
        System.out.println(res);*/
    }
}