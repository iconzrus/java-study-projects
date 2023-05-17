package com.yuriybishel.program;

import com.yuriybishel.arrays.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Дан массив целых чисел. Заполнить данный массив с клавиатуры. Scanner подать как аргумент метода
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));*/

        /**
         * 2. Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fillRandom(arr, a,b);*/

        /**
         * 3. Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr,scanner);
        String res = ArrayUtil.toString(arr);
        System.out.println(res);*/

        /**
         * 4. Дан массив целых чисел. Выведите все элементы массива с четными индексами.
         * В программе запрещено использовать условную инструкцию для проверки четности индексов.
         * Решение оформить 2 способами:
         * -возвращать строковое представление массива в формате JSON
         * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        String res = ArrayUtil.evenIndexes(arr);
        System.out.println(res);*/

        /**
         * 5. evenData
         * Дан массив целых чисел. Выведите все четные элементы массива.
         *
         *Для проверки четности элемента массива реализовать отдельный метод isEven,
         * который будет проверять, является ли переданный ей элемент четным.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        String res = ArrayUtil.evenData(arr);
        System.out.println(res);*/

        /**
         * 6. countPositive
         * Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.countPositive(arr);
        System.out.println(res);*/

        /**
         * 7. greatPrev
         * Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        String res = ArrayUtil.greatPrev(arr);
        System.out.println(res);*/

        /**
         * 8. sameNeighbours
         * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака, выведите эти числа.
         * Если соседних элементов одного знака нет - не выводите ничего.
         * Если таких пар соседей несколько - выведите первую пару.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] x = ArrayUtil.sameNeighbours(arr);
        System.out.println(Arrays.toString(x));*/

        /**
         * 9. greaterNeighbours
         * Дан массив целых чисел. Определите, сколько в этом массиве элементов,
         * которые больше двух своих соседей и выведите количество таких элементов.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int x = ArrayUtil.greaterNeighbours(arr);
        System.out.println(x);*/

        /**
         * 10. max
         * Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.max(arr);
        System.out.println(res);*/

        /**
         * 11. maxValues
         * Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
         * Указание:
         * -Вернуть результат в виде массива
         * -Вернуть результат в виде массива используя ArrayList
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int[] res = ArrayUtil.maxValues(arr);
        System.out.println(Arrays.toString(res));
        ArrayList res2 = ArrayUtil.maxValues2(arr);
        System.out.println(res2);*/

        /**
         *12. minPositive
         * Дан массив целых чисел. Выведите значение наименьшего из всех положительных элементов в массиве.
         * Известно, что в массиве есть хотя бы один положительный элемент.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.minPositive(arr);
        System.out.println(res);*/

        /**
         * 13. minOdd
         * Дан массив целых чисел. Выведите значение наименьшего нечетного элемента массива,
         * а если в массиве нет нечетных элементов см. способы реализации.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.minOdd(arr);
        Integer res2 = ArrayUtil.minOdd2(arr);
        System.out.println(res);
        System.out.println(res2);*/

        /**
         * Дан массив целых чисел, упорядоченный по неубыванию элементов в нем.
         * Определите, сколько в нем различных элементов (количество неравных друг другу элементов).
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int res = ArrayUtil.countDifferent(arr);
        System.out.println(res);*/

        /**
         * Дан массив целых чисел. Переставьте элементы данного массива в обратном порядке.
         * Метод должен производить разворот исходного массива, ничего не возвращая.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayUtil.reverse(arr);
        System.out.println(Arrays.toString(arr));*/

        /**
         * Дан массив целых чисел. Переставьте соседние элементы массива.
         * Если элементов нечетное число, то последний элемент остается на своем месте.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        ArrayUtil.reverseNeighbours(arr);
        System.out.println(Arrays.toString(arr));*/

        /**
         * Дан массив целых чисел и параметр k. Если данный параметр истинный, то выполнить циклический сдвиг массива
         * на одну позицию вправо, если ложный, то влево. Метод должен производить операции над массивом, ничего не возвращая.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        ArrayUtil.fill(arr, scanner);
        boolean k = scanner.nextBoolean();
        ArrayUtil.shift(arr,k);
        System.out.println(Arrays.toString(arr));*/


        /**
         * Дан массив целых чисел и число k. Выполнить циклический сдвиг массива на |k| позиций вправо, если k>0
         * или влево, если k<0. Метод должен производить операции над массивом, ничего не возвращая.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));
        int n = scanner.nextInt();
        ArrayUtil.shift2(arr, n);
        System.out.println(Arrays.toString(arr));*/

        /**
         * Дан массив целых чисел и число key. Методом линейного поиска
         * при помощи цикла for найти индекс вхождения числа key в массиве
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));
        int key = scanner.nextInt();
        int indx = ArrayUtil.search(arr, key);
        System.out.println(indx);*/

        /**
         * Модернизировать программу выше таким образом, чтобы она вернула индексы всех вхождений числа key в массиве.\
         * использовать массив для хранения элементов
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));
        int key = scanner.nextInt();
        int[] indx = ArrayUtil.search2(arr, key);
        System.out.println(Arrays.toString(indx));*/

        /**
         * Даны два массива целых чисел. Сравнить их на равенство.
         * Указание:
         * Под равенством двух массивов понимать их тождественное равенство, то есть два массива с
         * одинаковыми длинами, одинаковыми элементами, но разным порядком этих элементов считаются разными
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));
        int k2 = scanner.nextInt();
        int[] arr2 = new int[k2];
        ArrayUtil.fill(arr2, scanner);
        System.out.println(Arrays.toString(arr2));
        boolean res = ArrayUtil.equals(arr, arr2);
        if (res) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println(res);*/

        /**
         * Даны два массива целых чисел. Сравнить их на равенство по содержанию,
         * то есть не учитывая порядок этих элементов.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        System.out.println(Arrays.toString(arr));
        int k2 = scanner.nextInt();
        int[] arr2 = new int[k2];
        ArrayUtil.fill(arr2, scanner);
        System.out.println(Arrays.toString(arr2));
        String res = ArrayUtil.equals(arr, arr2);
        System.out.println(res);*/

        /**
         * Даны два массива целых чисел. Сравнить их на равенство по содержанию, то есть не учитывая порядок этих элементов.
         */
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        int k2 = scanner.nextInt();
        int[] arr2 = new int[k2];
        ArrayUtil.fill(arr2, scanner);
        boolean res = ArrayUtil.equalsIgnoreCase(arr,arr2);
        System.out.println(res);*/

        /**
         * 37. towards
         * Дан массив вещественных чисел. Сформировать его строковое представление в формате JSON следующем порядке:
         * первое число, последнее, второе, предпоследнее и так далее все числа (см. пример).
         * Пример:
         * Входные данные: 1 2 3 4 5
         * Выходные данные:  [1, 5, 2, 4, 3]
         */
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = 5;
        int b = 2;
        int[] arr = new int[k];
        ArrayUtil.fill(arr, scanner);
        String res = ArrayUtil.towards(arr);
        System.out.println(res);
        System.out.println(a/b);
    }
}