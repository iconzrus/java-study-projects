package com.yuriybishel.program;

import com.yuriybishel.arrays.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Дан массив целых чисел. Выведите все элементы массива с четными индексами. В программе запрещено
         * использовать условную инструкцию для проверки четности индексов.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.evenIndexes(arr);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел. Выведите все четные элементы массива.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.evenData(arr);
        System.out.println(arrayList);*/

        /**
         *Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.greatPrev(arr);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.maxValues(arr);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел и номер элемента в массиве k. Удалите из массива элемент с индексом k.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.delete(arr, n);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел, число k и значение C. Необходимо вставить в массив на позицию с индексом k
         * элемент, равный C
         */
        /*Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.insert(arr, n, C);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
         * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.unique(arr);
        System.out.println(arrayList);*/

        /**
         *Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
         * -Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.frequent(arr);
        System.out.println(arrayList);*/

        /**
         * Дан массив целых чисел и число key. Методом линейного поиска при помощи цикла for найти индекс
         * вхождения числа key в массиве
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayList<Integer> arrayList = ArrayUtil.search(arr, n);
        System.out.println(arrayList);*/

        /**
         * Завести пустой LinkedList и добавить туда строки с консоли. Произвести удаление элемента по индексу,
         * по значению, найти индекс вхождения элемента в списке, определить есть ли такой элемент в списке.
         * Пользоваться только встроенными методами языка
         */
        LinkedList<String> res = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            res.add(scanner.next());
        }
        System.out.println(res);
        String deleted = "5";
        res.remove(deleted);
        System.out.println(res);
        res.remove(3);
        System.out.println(res);
        Integer x = res.indexOf("3");
        System.out.println(x);
        String z = res.get(2);
        System.out.println(z);
        boolean c = res.contains("3");
        System.out.println(c);


    }
}