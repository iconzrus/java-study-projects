package com.yuriybishel.program;

import com.yuriybishel.arrays.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        /**
         * Дан массив целых чисел. Посчитайте, сколько в нем пар элементов, равных друг другу. Считается,
         * что любые два элемента, равные друг другу образуют одну пару, которую необходимо посчитать.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] mass = new int[k];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        int res = ArrayUtil.countEqualPairs(mass);
        System.out.println(res);*/

        /**
         * Дан массив целых чисел. Посчитайте, сколько в нем различных элементов, не изменяя самого массива.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.countDifferent(arr);
        System.out.println(res);*/

        /**
         *Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
         * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
         *
         * -использовать вспомогательный массив для хранения элементов
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.unique(arr);
        System.out.println(Arrays.toString(res));*/

        /**
         * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
         * Если таких чисел несколько, выведите см. способы реализации.
         * Решение оформить 3 способами:
         * -Вернуть первый элемент, удовлетворяющий условиям задачи
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.frequent2(arr);
        System.out.println(Arrays.toString(res));*/

        /**
         * Дан массив типа Integer. Отсортировать его в порядке убывания. Использовать стандартные методы из языка
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Integer[] arr = new Integer[k];
        ArrayUtil.fillInteger(arr, scanner);
        Integer[] res = ArrayUtil.sortdown(arr);
        System.out.println(Arrays.toString(arr));*/

        /**
         *Дан массив. Произвести его копирование с указанием новой длины. Использовать стандартные методы из языка
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.copy(arr, n);
        System.out.println(Arrays.toString(res));*/
        /***
         *Используя System.arrayCopy скопировать массив в новый массив, вставляя данные с позиции k.
         *  Размер массива результата должен быть явно больше размера исходного массива
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.arrayCopy(arr, n);
        System.out.println(Arrays.toString(res));*/

        /**
         * Отсортировать массив и найди индекс вхождения заданного ключа в отсортированном массиве.
         * Использовать только стандартные методы языка
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.sort(arr, n);
        System.out.println(res);*/

        /**
         *Дан массив, сделать его копию
         * Указание:
         * Метод должен принимать на вход 2 параметра: исходный массив, который надо скопировать и длину нового массива.
         * Если длина исходного массива больше длины нового массива, то копируется только часть исходного массива, если
         * длина исходного массива меньше длины нового массива, то в новый массив исходный массив копируется полностью,
         * а оставшаяся незаполненная часть записывается нулями, если же размер нового массива совпадает с размером исходного,
         * то в новый массив копируется полностью исходный.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.copyOf2(arr, n);
        System.out.println(Arrays.toString(res));*/

        /**
         *copyOfRange
         * Дан массив и два целых числа b и e, сделать копию исходного массива начиная с индекса а и заканчивая b
         * Указание:
         * Метод должен принимать на вход 3 параметра: исходный массив, который надо скопировать и границы копирования.
         * Если длина исходного массива меньше числа a, то вернуть null. Если длина исходного массива меньше  числа b,
         * то в новый массив исходный массив копируется полностью, а оставшаяся незаполненная часть записывается нулями.
         */
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.copyOfRange2(arr, a, b);
        System.out.println(Arrays.toString(res));*/

        /**
         *Дан массив целых чисел. Выполнить сортировку массива пузырьком и сортировкой отбором (линейная сортировка).
         */
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.equalItems(arr);
        System.out.println(Arrays.toString(res));

    }
}