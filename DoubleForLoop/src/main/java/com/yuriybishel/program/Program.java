package com.yuriybishel.program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Даны числа m, n вывести таблицу m на n, заполненную числами 1
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }*/

        /**
         *Даны числа m, n вывести таблицу m на n, заполненную числами, равными номеру строки этой таблицы
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        /**
         *Даны числа m, n вывести таблицу m на n, заполненную числами, равными номеру столбца этой таблицы
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /**
         * По данному натуральному n выведите лесенку из n ступенек, i-я ступенька состоит из
         * чисел от 1 до i без пробелов.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /**
         * По данному натуральному n вычислите сумму 1!+2!+3!+...+n!. В решении этой задачи
         * можно использовать только вложенные циклы. PS: Такое решение считается неоптимальным.
         * Оптимально мы решали уже эту задачу в разделе ForLoop одним циклом. Здесь же требуется д
         * ля каждого числа i от 1 до n посчитать его факториал i!, то есть произведение всех чисел от 1 до i.
         * Переменную для факториала сделать локальной переменной внутри первого цикла,
         * переменную суммы внешней переменной до всех циклов
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 1;
            for (int j = 1; j <= i; j++) {
                sum *= j;
            }
            sum2 += sum;
        }
        System.out.println(sum2);*/

        /**
         * На диапазоне от а до b найти количество простых чисел, а так же вывести эти числа в консоль
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r2 = 0;
        for (int i = a; i <= b; i++) {
            int r = 0;
            for (int j = 1; j < b; j++) {
                if (i%j==0) {
                    r++;
                }
            }
            if (r == 2) {
                r2++;
                System.out.println(i);
            }
        }
        System.out.println("Число простых чисел:" + r2);*/

        /**
         * На диапазоне от а до b найти количество совершенных чисел, а так же вывести четные совершенные числа.
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = 0;
        for (int i = a; i <= b; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                r++;
                if (i%2 == 0) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("Количество совершенных чисел:" + r);*/

        /**
         * По данному натуральному n выведите лесенку из n ступенек в обратном порядке, как в примере.
         */
        // i отвечает за строки, по задаче строки идут в убывающем порядке, значит цикл идет на уменьшение
        // j отвечает за столбцы, а значит j цикл должен идти на возрастание
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        /**
         * По данному натуральному n выведите лесенку из n ступенек в полном обратном порядке, как в примере
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /**
         * По данному натуральному n выведите лесенку из n ступенек, заполненную числами и тильдами
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("~");
            }
            for (int j = sum; j >= 1; j--) {
                System.out.print(j);

            }
            sum--;
            System.out.println();
        }*/

        /**
         * Даны числа m, n вывести таблицу m на n, заполненную числами по порядку,
         * под каждую ячейку таблицы выделяется минимально два знака
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                k++;
                System.out.printf("%2d ", k);
            }
            System.out.println();
        }*/

        /**
         * Даны числа m, n вывести таблицу m на n, заполненную числами по порядку, в четных строках
         * только четные числа, в нечетных – нечетные, под каждую ячейку таблицы выделяется минимально два знака
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = 1;
        int t = 2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%2d ", t);
                    t += 2;
                } else {
                    System.out.printf("%2d ", k);
                    k += 2;
                }
            }
            System.out.println();
        }*/
    }
}
