package com.yuriybishel.program;

import com.yuriybishel.arrays.DoubleArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Дан двумерный массив. Заполнить его с консоли
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();*/

        /**
         * Дан двумерный массив. Перевести его в строковое значение в виде таблицы,
         * для перехода на новую строку внутри String использовать символ “\n”
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        String res = DoubleArrays.doubleArrayToString(arr);
        System.out.println(res);*/

        /**
         * Найти наибольшее значение двумерного массива
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        int res = DoubleArrays.doubleArrayMax(arr);
        System.out.println(res);*/

        /**
         * Найти сумму всех элементов двумерного массива
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        int res = DoubleArrays.doubleArraySum(arr);
        System.out.println(res);*/

        /**
         * Найти произведение всех элементов двумерного массива размером n на n, находящихся на главной диагонали таблицы.
         * Главная диагональ – диагональ, содержащая элементы слева налево, сверху вниз
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        int res = DoubleArrays.mainDiagonal(arr);
        System.out.println(res);*/

        /**
         * Найти произведение всех элементов двумерного массива размером n на n, находящихся на побочной диагонали таблицы.
         * Побочная диагональ – диагональ, содержащая элементы справа налево, сверху вниз
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        int res = DoubleArrays.secondaryDiagonal(arr);
        System.out.println(res);*/

        /**
         * Найти наибольшее значение по каждой строке двумерного массива, вернув массив наибольших элементов в каждой строке
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] res = DoubleArrays.ArrayStringMax(arr);
        System.out.println(Arrays.toString(res));*/

        /**
         * Найти наибольшее значение по каждому столбцу двумерного массива, вернув массив наибольших элементов в каждом столбце
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] res = DoubleArrays.maxCols(arr);
        System.out.println(Arrays.toString(res));*/

        /**
         *Найти наименьшее значение в каждой строке и наименьшее в каждом столбце двумерного массива,
         * вернув двумерный массив, состоящий из двух строк
         */
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        DoubleArrays.fill(arr, scanner);
        int[][] res = DoubleArrays.minRowsCols(arr);
        System.out.println(Arrays.deepToString(res));

            /**
             * Заполнить двумерный массив числами по порядку, начиная с единицы и так далее
             */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int[][] res = DoubleArrays.fill2(arr);
        System.out.println(Arrays.deepToString(res));*/

            /**
             * Заполнить двумерный массив числами, равными номеру строки
             */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int[][] res = DoubleArrays.fillStringNumber(arr);
        System.out.println(Arrays.deepToString(res));*/

            /**
             * Заполнить двумерный массив числами, равными номеру столбца
             */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int[][] res = DoubleArrays.fillColumnNumber(arr);
        System.out.println(Arrays.deepToString(res));*/

        /**
         * Заполнить двумерный массив числами по порядку, в четных строках должны быть четные числа,
         * в нечетных строках – нечетные
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int[][] res = DoubleArrays.fillNumberEvenOdd(arr);
        System.out.println(DoubleArrays.doubleArrayToString(res));*/

        /**
         * Заполнить двумерный массив числами, в четных строках должны быть четные числа в порядке убывания,
         * в нечетных строках – нечетные в порядке возрастания
         */
        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int[][] res = DoubleArrays.fillNumberEvenOdd2(arr);
        System.out.println(DoubleArrays.doubleArrayToString(res));*/


    }
}