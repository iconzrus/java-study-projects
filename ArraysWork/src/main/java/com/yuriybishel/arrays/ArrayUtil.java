package com.yuriybishel.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ArrayUtil {
    public static void fill(int[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
    }

    public static void fill(Integer[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
    }

    /**
     * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
     * читается, что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
     */
    public static int countEqualPairs(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Дан массив целых чисел. Посчитайте, сколько в нем различных элементов, не изменяя самого массива.
     * Указание:
     * Необходимо считать те элементы, которые встретились нам впервые. Чтобы проверить, встретился ли нам
     * элемент A[i] впервые, необходимо проверить, встречается ли значение A[i] среди элементов с индексами, меньшими i.
     */
    public static int countDifferent(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            boolean x = false;
            for (int j = i - 1; j >= 0; j--) {
                if (mass[i] == mass[j]) {
                    x = true;
                }
            }
            if (!x) {
                count++;
            }
        }
        return count;
    }

    /**
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз. Элементы нужно
     * выводить в том порядке, в котором они встречаются в массиве.
     * <p>
     * -использовать вспомогательный массив для хранения элементов
     */
    //TODO дописать
    public static int[] unique(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, k = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                result[k++] = mass[i];
            }
        }
        return result;
    }

    /**
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить 3 способами:
     * -Вернуть первый элемент, удовлетворяющий условиям задачи
     */
    public static int frequent(int[] mass) {
        int max = 0;
        int res = 0;
        for (int i = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
                res = mass[i];
            }
        }
        return res;
    }

    public static int[] frequent2(int[] mass) {
        int max = 0;
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
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt == max) {
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 0, t = 0; i < mass.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    cnt++;
                }
            }
            if (cnt == max) {
                res[t++] = mass[i];
            }
        }
        return res;
    }

    /**
     * Дан массив типа Integer. Отсортировать его в порядке убывания. Использовать стандартные методы из языка
     */
    public static Integer[] sortdown(Integer[] mass) {
        Arrays.sort(mass, Comparator.reverseOrder());
        return mass;
        Arrays.
    }


    /**
     * Дан массив. Произвести его копирование с указанием новой длины. Использовать стандартные методы из языка
     */
    public static int[] copy(int[] mass, int k) {
        return Arrays.copyOf(mass, mass.length + k);
    }

    /**
     * Используя System.arrayCopy скопировать массив в новый массив, вставляя данные с позиции k.
     * Размер массива результата должен быть явно больше размера исходного массива
     */
    public static int[] arrayCopy(int[] mass, int k) {
        int[] mass2 = new int[mass.length + k];
        System.arraycopy(mass, 0, mass2, k, mass.length);
        return mass2;
    }

    /**
     * Отсортировать массив и найти индекс вхождения заданного ключа в отсортированном массиве.
     * Использовать только стандартные методы языка
     */
    public static int sort(int[] mass, int key) {
        Arrays.sort(mass);
        return Arrays.binarySearch(mass, key);
    }

    /**
     * Дан массив. Найдите элементы, равные друг другу.
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов(для определения количества равных использовать метод из задачи  23)
     * -использовать ArrayList для накопления элементов
     */

    public static int[] equalItems(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
        }
        int[] res = new int[count];
        for (int i = 0, t = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    res[t++] = mass[i];
                }
            }
        }
        return res;
    }
}










