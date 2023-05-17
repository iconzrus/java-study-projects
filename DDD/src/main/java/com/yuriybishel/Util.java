package com.yuriybishel;

import static java.lang.Math.sqrt;

public class Util {
    /**
     * Напишите программу, которая находит гипотенузу прямоугольного треугольника по заданным катетам a и b.
     */
    //TODO c = sqrt(a^2 + b^2)
    public static double findHypotenuse(double a, double b) {
        return sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * Напишите программу, которая находит площадь круга по заданному радиусу.
     */
    //TODO S = π * r^2
    public static double calculateCircleArea(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Напишите программу, которая находит косинус угла по заданному значению его тангенса.
     */
    //TODO cos(α) = 1 / sqrt(1 + tan^2(α))
    public static double calculateCosineFromTangent(double tan) {
        return 1 / (Math.sqrt(1 + Math.pow(tan, 2)));
    }

    /**
     * Напишите программу, которая находит наибольшее общее кратное двух заданных чисел.
     */
    //TODO НОК(a, b) = |a * b| / НОД(a, b)
    public static double calculateLCM(double a, double b) {
        int NOD = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                NOD = i;
            }
        }
        return Math.abs(a * b) / NOD;
    }

    /**
     * Написать метод для проверки, является ли заданное число простым.
     */
    public static boolean isPrime(int a) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    /**
     * Напишите программу, которая выводит на экран все числа от 1 до 100, которые делятся на 3 без остатка.
     */

    public static int Numbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        return 0;
    }

    /**
     * Напишите программу, которая находит сумму всех элементов массива типа int.
     */

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    /**
     * Напишите метод, который принимает на вход два аргумента - массив типа int и число. Метод должен вернуть true, если число есть в массиве, и false в противном случае.
     */
    public static boolean isNumberInArray(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }
        }
        return false;
    }

    /**
     * Напишите программу, которая запрашивает у пользователя имя и возраст, а затем выводит на экран приветствие вида "Привет, Иван! Тебе 25 лет.".
     */
    public static String person(String name, int age) {
        return "Привет, " + name + "! Тебе " + age + " лет";
    }

    /**
     * Напишите метод, который принимает на вход два аргумента - две строки. Метод должен вернуть новую строку,
     * состоящую из символов первой и второй строки чередующимися между собой (например, "abc" и "def" должны превратиться в "adbecf").
     */

    public static String mix(String a, String b) {
        String res = "";
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            res += a.charAt(i);
            res += b.charAt(i);
        }
        return res;
    }

    /**
     * Напишите метод, который принимает на вход целочисленный массив и возвращает наименьший элемент в этом массиве.
     */
    public static int min(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * Напишите метод, который принимает на вход строку и возвращает эту же строку в обратном порядке.
     */
    public static String reverseString(String a) {
        String res = "";
        for (int i = a.length() - 1; i > 0; i--) {
            res += a.charAt(i);
        }
        return res;
    }

    /**
     * Напишите метод, который принимает на вход два массива целых чисел одинаковой длины и
     * возвращает массив, который содержит суммы элементов первого и второго массивов на соответствующих позициях.
     */
    public static int[] arraysSum(int[] a, int[] b) {
        int[] x = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i] + b[i];
        }
        return x;
    }

    /**
     * Напишите метод, который принимает на вход два массива целых чисел и возвращает true, если сумма
     * элементов первого массива равна сумме элементов второго массива, и false в противном случае.
     */
    public static boolean equalArrays(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }
        return sum1 == sum2;
    }

    /**
     * Напишите метод, который принимает на вход строку и возвращает количество слов в этой строке.
     */
    public static boolean isWord(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetter(a.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int wordsNumber(String a) {
        int count = 0;
        String[] x = a.split(" ");
        for (String s : x) {
            if (!a.isEmpty() && isWord(s)) {
                count++;
            }
        }
        return count;
    }

    /**
     * 
     */
}



