package com.yuriybishel.arrays;

import java.util.Scanner;

public class DoubleArrays {
    /**
     * Дан двумерный массив. Заполнить его с консоли
     */
    public static void fill(int[][] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * Дан двумерный массив. Перевести его в строковое значение в виде таблицы,
     * для перехода на новую строку внутри String использовать символ “\n”
     */
    public static String doubleArrayToString(int[][] mass) {
        String res = "";
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                res += mass[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

    /**
     * Найти наибольшее значение двумерного массива
     */
    public static int doubleArrayMax(int[][] mass) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (max < mass[i][j]) {
                    max = mass[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Найти сумму всех элементов двумерного массива
     */
    public static int doubleArraySum(int[][] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                sum += mass[i][j];
            }
        }
        return sum;
    }

    /**
     * Найти произведение всех элементов двумерного массива размером n на n, находящихся на главной диагонали таблицы.
     * Главная диагональ – диагональ, содержащая элементы слева налево, сверху вниз
     */
    public static int mainDiagonal(int[][] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i][i];

        }
        return sum;
    }

    /**
     * Найти произведение всех элементов двумерного массива размером n на n, находящихся на побочной диагонали таблицы.
     * Побочная диагональ – диагональ, содержащая элементы справа налево, сверху вниз
     */
    public static int secondaryDiagonal(int[][] mass) {
        int sum = 1;
        for (int i = 0, j = mass.length - 1; i < mass.length; i++, j--) {
            sum *= mass[i][j];
        }
        return sum;
    }

    /**
     * Найти наибольшее значение по каждой строке двумерного массива, вернув массив наибольших элементов в каждой строке
     */
    public static int[] maxRows(int[][] mass) {
        int[] max = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (mass[i][j] > max[i]) {
                    max[i] = mass[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Найти наибольшее значение по каждому столбцу двумерного массива, вернув массив наибольших элементов в каждом столбце
     */
    public static int[] maxCols(int[][] mass) {
        int[] max = new int[mass[0].length];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (mass[i][j] > max[j]) {
                    max[j] = mass[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Найти наименьшее значение в каждой строке и наименьшее в каждом столбце двумерного массива,
     * вернув двумерный массив, состоящий из двух строк
     */ //TODO Задать вопрос на уроке!"!!!
    /*public static int[][] minRowsCols(int[][] mass) {
        int[][] min = new int[5][5];
        //TODO тут должно быть наименьшее значение
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (mass[i][j] > min[0][j]) {
                    min[0][j] = mass[i][j];
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (mass[i][j] < min[1][j]) {
                    min[1][j] = mass[i][j];
                }
            }
        }
        return new int[][]{,};
    }*/

    /**
     * Заполнить двумерный массив числами по порядку, начиная с единицы и так далее
     */
    public static int[][] fill2(int[][] mass) {
        int k = 1;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++, k++) {
                mass[i][j] = k;
            }
        }
        return mass;
    }

    /**
     * Заполнить двумерный массив числами, равными номеру строки
     */
    public static int[][] fillStringNumber(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = i;
            }
        }
        return mass;
    }

    /**
     * Заполнить двумерный массив числами, равными номеру столбца
     */
    public static int[][] fillColumnNumber(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = j;
            }
        }
        return mass;
    }

    /**
     * Заполнить двумерный массив числами по порядку, в четных строках должны быть четные числа, в нечетных строках – нечетные
     */
    public static int[][] fillNumberEvenOdd(int[][] mass) {
        int k = 1;
        int k2 = 2;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if (i % 2 == 0) {
                    mass[i][j] = k;
                    k += 2;
                } else {
                    mass[i][j] = k2;
                    k2 += 2;
                }
            }
        }
        return mass;
    }

    /**
     * Заполнить двумерный массив числами, в четных строках должны быть четные числа в порядке убывания,
     * в нечетных строках – нечетные в порядке возрастания
     */
    public static int[][] fillNumberEvenOdd2(int[][] mass) {
        int k = 1;
        int k2 = 2;
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mass[0].length; j++) {
                    mass[i][j] = k;
                    k += 2;
                }
            } else {
                for (int j = mass[0].length - 1; j >= 0; j--, k2 += 2) {
                    mass[i][j] = k2;
                }
            }
        }
        return mass;
    }
}
