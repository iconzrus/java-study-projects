package com.yuriybishel.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUtil {
    public static void fill(int[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
    }

    /**
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами. В программе запрещено
     * использовать условную инструкцию для проверки четности индексов.
     * используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static ArrayList<Integer> evenIndexes(int[] mass) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                arrayList.add(mass[i]);
            }
        }
        return arrayList;
    }

    /**
     * Дан массив целых чисел. Выведите все четные элементы массива.
     * используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static ArrayList<Integer> evenData(int[] mass) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                arrayList.add(mass[i]);
            }
        }
        return arrayList;
    }

    /**
     * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     */
    public static ArrayList<Integer> greatPrev(int[] mass) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                arrayList.add(mass[i]);
            }
        }
        return arrayList;
    }

    /**
     * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
     */
    public static ArrayList<Integer> maxValues(int[] mass) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (max == mass[i]) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /**
     * Дан массив целых чисел и номер элемента в массиве k. Удалите из массива элемент с индексом k.
     */
    public static ArrayList<Integer> delete(int[] mass, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (k == i) {
                continue;
            } else {
                res.add(mass[i]);
            }
        }
        return res;
    }

    /**
     * Дан массив целых чисел, число k и значение C.
     * Необходимо вставить в массив на позицию с индексом k элемент, равный C
     */
    public static ArrayList<Integer> insert(int[] mass, int k, int C) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (k == i) {
                res.add(C);
            } else {
                res.add(mass[i]);
            }
        }
        return res;
    }

    /**
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
     * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
     */
    public static ArrayList<Integer> unique(int[] mass) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
            if (count == 1) {
                res.add(mass[i]);
            }
        }
        return res;
    }

    /**
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
     */
    public static ArrayList<Integer> frequent(int[] mass) {
        int max = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt == max) {
                res.add(mass[i]);
            }
        }
        return res;
    }

    /**
     * Дан массив целых чисел и число key. Методом линейного поиска при помощи цикла for найти
     * индекс вхождения числа key в массиве
     */
    public static ArrayList<Integer> search(int[] mass, int key) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                res.add(i);
            }
        }
        return res;
    }
}
