package com.yuriybishel.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ArrayUtil {
    /**
     * Fill array with input numbers
     *
     * @param mass array of integer numbers
     */
    public static void fill(int[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
    }

    /**
     * Get random number from [a,b]
     *
     * @param a integer number
     * @param b integer number
     */
    public static int getRandomNumber(int a, int b) {
        int x = (int) (Math.random() * (b - a)) + a;
        return x;
    }

    /**
     * Fill array with random number from [a,b]
     *
     * @param a integer number
     * @param b integer number
     */
    public static void fillRandom(int[] mass, int a, int b) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = getRandomNumber(a, b);
        }
    }

    /**
     * Convert the given array to a JSON string value
     *
     * @param mass array of integer numbers
     */
    public static String toString(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length; i++) {
            if (!res.equals("[")) {
                res += ", ";
            }
            res += mass[i];
        }
        res += "]";
        return res;
    }

    /**
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами.
     * В программе запрещено использовать условную инструкцию для проверки четности индексов.
     * Решение оформить 2 способами:
     * Возвращать строковое представление массива в формате JSON
     */
    public static String evenIndexes(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length; i += 2) {
            if (!res.equals("[")) {
                res += ", ";
            }
            res += mass[i];
        }
        res += "]";
        return res;
    }

    /**
     * 5. evenData
     * Дан массив целых чисел. Выведите все четные элементы массива.
     * Указание:
     * Для проверки четности элемента массива реализовать отдельный метод isEven, который будет проверять, является ли переданный ей элемент четным.
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static String evenData(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length; i++) {
            if (isEven(mass[i])) {
                if (!res.equals("[")) {
                    res += ", ";
                }
                res += mass[i];
            }
        }
        res += "]";
        return res;
    }


    /**
     * Define if number is even
     *
     * @param n integer
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Determine the number of positive elements in array
     *
     * @param mass array of integer numbers
     */

    /**
     * 6. countPositive
     * Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
     */
    public static int countPositive(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 7. greatPrev
     * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     */
    public static String greatPrev(int[] mass) {
        String res = "[";
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                if (!res.equals("[")) {
                    res += ", ";
                }
                res += mass[i];
            }
        }
        res += "]";
        return res;
    }

    /**
     * 8. sameNeighbours
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
     * Если соседних элементов одного знака нет - не выводите ничего. Если таких пар соседей несколько - выведите первую пару.
     */
    public static int[] sameNeighbours(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            if ((mass[i] > 0 && mass[i - 1] > 0) || (mass[i] < 0 && mass[i - 1] < 0)) {
                return new int[]{mass[i - 1], mass[i]};
            }
        }
        return new int[]{};
    }

    /**
     * 9. greaterNeighbours
     * Дан массив целых чисел. Определите, сколько в этом массиве элементов,
     * которые больше двух своих соседей и выведите количество таких элементов.
     */
    public static int greaterNeighbours(int[] mass) {
        int count = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i] > mass[i - 1] && mass[i] > mass[i + 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * 10. max
     * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */
    public static int max(int[] mass) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return max;
    }

    /**
     * 11. maxValues
     * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
     * Указание:
     * -Вернуть результат в виде массива
     */
    public static int[] maxValues(int[] mass) {
        int max = max(mass);
        int count = 0;
        for (int val : mass) {
            if (val >= max) {
                count++;
            }
        }
        int indx[] = new int[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                indx[j++] = i;
            }
        }
        return indx;
    }

    /**
     * 12. minPositive
     * Дан массив целых чисел. Выведите значение наименьшего из всех положительных элементов в массиве.
     * Известно, что в массиве есть хотя бы один положительный элемент.
     */
    public static int minPositive(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0 && mass[i] < min) {
                min = mass[i];
            }
        }
        return min;
    }

    /**
     * Дан массив целых чисел. Выведите значение наименьшего нечетного элемента массива,
     * а если в массиве нет нечетных элементов см. способы реализации.
     */
    public static int minOdd(int[] mass) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (!ArrayUtil.isEven(mass[i]) && min > mass[i]) {
                min = mass[i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return min;
        }
    }

    /**
     * -Вернуть значение null, указав тип возвращаемого значения объектную оболочку типа int – Integer.
     */
    public static Integer minOdd2(int[] mass) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (!ArrayUtil.isEven(mass[i]) && min > mass[i]) {
                min = mass[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            return min;
        }
    }

    /**
     * Дан массив целых чисел, упорядоченный по неубыванию элементов в нем. Определите,
     * сколько в нем различных элементов (количество неравных друг другу элементов).
     */
    public static int countDifferent(int[] mass) {
        int count = 1;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] != mass[i - 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * Дан массив целых чисел. Переставьте элементы данного массива в обратном порядке.
     * Метод должен производить разворот исходного массива, ничего не возвращая.
     */
    public static void reverse(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int c = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = c;
        }
    }

    /**
     * Дан массив целых чисел. Переставьте соседние элементы массива. Если элементов нечетное число,
     * то последний элемент остается на своем месте.
     */
    public static void reverseNeighbours(int[] mass) {
        for (int i = 0; i < mass.length; i += 2) {
            int temp = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = temp;
        }
    }

    /**
     * Дан массив целых чисел и параметр k. Если данный параметр истинный, то выполнить циклический сдвиг массива
     * на одну позицию вправо, если ложный, то влево. Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift(int[] mass, boolean k) {
        if (k) {
            int t = mass[mass.length - 1];
            for (int i = mass.length - 1; i > 0; i--) {
                mass[i] = mass[i - 1];
            }
            mass[0] = t;
        } else {
            int t = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                mass[i] = mass[i + 1];
            }
            mass[0] = t;
        }
    }

    /**
     * Дан массив целых чисел и число k. Выполнить циклический сдвиг массива на |k| позиций вправо,
     * если k>0 или влево, если k<0. Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift2(int[] mass, int k) {
        for (int i = 0; i < abs(k); i++) {
            ArrayUtil.shift(mass, k > 0);
        }
    }

    /**
     * Дан массив целых чисел и число key. Методом линейного поиска
     * при помощи цикла for найти индекс вхождения числа key в массиве
     */
    public static int search(int[] mass, int key) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Модернизировать программу выше таким образом, чтобы она вернула индексы всех вхождений числа key в массиве.
     * использовать массив для хранения элементов
     */
    public static int[] search2(int[] mass, int key) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                res[i] = i;
            }
        }
        return res;
    }

    /**
     * Даны два массива целых чисел. Сравнить их на равенство.
     * Указание:
     * Под равенством двух массивов понимать их тождественное равенство, то есть два массива
     * с одинаковыми длинами, одинаковыми элементами, но разным порядком этих элементов считаются разными
     */
    public static boolean equals(int[] mass1, int[] mass2) {
        if (mass1.length != mass2.length) {
            return false;
        }
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] != mass2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Даны два массива целых чисел. Сравнить их на равенство по содержанию, то есть не учитывая порядок этих элементов.
     */
    public static boolean equalsIgnoreCase(int[] mass1, int[] mass2) {
        for (int val : mass1) {
            int search = search(mass2, val);
            if (search == -1) {
                return false;
            }
        }
        for (int val : mass2) {
            int search = search(mass1, val);
            if (search == -1) {
                return false;
            }
        }
        return true;
    }


    /**
     * Дан массив целых чисел. Определить, является ли он упорядоченным
     */
    public static boolean isOrderAsc(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOrderDesc(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < mass[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOrder(int[] mass) {
        return isOrderAsc(mass) || isOrderDesc(mass);
    }

    /**
     * towards
     * Дан массив вещественных чисел. Сформировать его строковое представление в формате JSON следующем порядке:
     * первое число, последнее, второе, предпоследнее и так далее все числа (см. пример).
     * Пример:
     * Входные данные: 1 2 3 4 5
     * Выходные данные:  [1, 5, 2, 4, 3]
     */
    public static String towards(int[] mass) {
        String res = "[";
        for (int i = 0, j = mass.length - 1; i < (mass.length / 2) + 1 ; i++, j--) {
            if (!res.equals("[")) {
                res += ", ";
            }
            res += mass[i];
            if (i==mass.length/2 && mass.length%2 != 0) {
                break;
            }
            res += ", ";
            res += mass[j];
            if (mass.length%2 == 0 && i==(mass.length/2)-1) {
                break;
            }
        }
        res += "]";
        return res;
    }
}










