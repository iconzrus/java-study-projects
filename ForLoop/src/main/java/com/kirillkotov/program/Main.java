package com.kirillkotov.program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();*/
        /*for (int i = 0; i < n; i++) {
            System.out.println("Hello World! " + i);
        }*/

        /*for (int i = 1; i <= n; i++) {
            System.out.println("Hello World! " + i);
        }*/

        /*for (int i = 2; i <= n; i++) {
            System.out.println("Hello World! " + i);
        }*/

        /*for (int i = 1; i <= n; i+=2) {
            System.out.println("Hello World! " + i);
        }*/

        /*for (int i = n; i >= 1; i--) {
            System.out.println("Hello World! " + i);
        }*/

        /*for (int i = n; i >= 1; i-=2) {
            System.out.println("Hello World! " + i);
        }*/

        /*int s = 0;
        for (int i = 1; i<= n; i++) {
            if(i == 2){
                continue;
            }

            s += i;
        }
        System.out.println(s);*/

        /**
         * Даны два целых числа A и B (при этом A≤B). Выведите все числа от A до B включительно, разделяя их пробелом.
         * После последнего числа тоже можно вывести пробел.
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int A = scanner.nextInt();
        System.out.println("Введите B");
        int B = scanner.nextInt();
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }*/

        /**
         * Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания,
         * если A < B, или в порядке убывания в противном случае.
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int A = scanner.nextInt();
        System.out.println("Введите B");
        int B = scanner.nextInt();
        if (A < B) {
            for (int i = A; i <= B ; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }*/

        /**
         * Дано число n. Посчитать значение суммы всех чисел от 1 до n. Использовать алгоритм накопления суммированием.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        /**
         * Даны числа a, b. Посчитать значение произведение всех чисел от a до b.
         * Использовать алгоритм накопления умножением.
         */
        //TODO переделать
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        System.out.println(x);*/

        /**
         * По данному натуральном n вычислите сумму 13+23+33+...+n3.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        for (int i = 0; i <= n; i++) {
            x += i*i*i;
        }
        System.out.println(x);*/

        /**
         * По данному натуральному n вычислите сумму 1×2+2×3+...+(n-1)×n.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        for (int i = 0; i <= n; i++) {
            x += (i - 1)*i;
        }
        System.out.println(x);*/

        /**
         * По данному целому неотрицательному n вычислите значение n!
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("Число отрицательно");
            return;
        }
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        System.out.println(x);*/

        /**
         * По данным двум натуральным числам A и B (A≤B) выведите все чётные числа на отрезке от A до B.
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int A = scanner.nextInt();
        System.out.println("Введите B");
        int B = scanner.nextInt();
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        /**
         * По данному натуральному числу n≤1000 выведите все натуральные
         * делители числа n в порядке возрастания.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (!(n <= 1000)){
            System.out.println("Число больше 1000");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (n%i == 0){
                System.out.println(i);
            }
        }*/

        /**
         * Дано 10 целых чисел. Вычислите их сумму. В решении можно использовать только три переменные.
         */
        /*Scanner scanner = new Scanner(System.in);
        int z = 0;
        for (int i = 0; i < 10; i++) {
            int x = scanner.nextInt();
            z += x;
        }
        System.out.println(z);*/

        /**
         * Дано несколько чисел. Вычислите их сумму. Сначала вводите
         * количество чисел N, затем вводится ровно N целых чисел.
         */
        /*Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            sum += n;
        }
        System.out.println(sum);*/

        /**
         * Дано N чисел: сначала вводится число N, затем вводится ровно N целых чисел.
         * Подсчитайте количество нулей среди введенных чисел и выведите это количество.
         */
        /*Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int r = 0;
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                r++;
            }
        }
        System.out.println(r);*/

        /**
         * Найдите и выведите все двузначные числа, которые равны удвоенному произведению своих цифр.
         * Программа не требует ввода данных с клавиатуры, просто выводит список искомых чисел.
         */
        /*Scanner scanner = new Scanner(System.in);
        for (int i = 10; i <= 99; i++) {
            if (i == (2 * (i / 10) * (i % 10))) {
                System.out.println(i);
            }*/

        /**
         * Квадрат трехзначного числа оканчивается тремя цифрами, равными этому числу. Найдите и выведите все такие числа.
         * Программа не требует ввода данных с клавиатуры, просто выводит список искомых чисел.
         */
        /*for (int i = 100; i <= 999; i++) {
            if (i == ((i * i) % 1000)) {
                System.out.println(i);
            }
        }*/

        /**
         * Дано натуральное число n. Выведите в порядке возрастания все трехзначные числа, сумма цифр которых равна n.
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 100; i < 999; i++) {
            if (n == (i % 10 + ((i / 10) % 10) + ((i / 100) % 10))) {
                System.out.println(i);
            }
        }*/

        /**
         * Даны числа а и b. Найти количество и произведение всех нечетных чисел на данном отрезке
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int count = 0;
        int mult = 1;
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                count++;
                mult *= i;
            }
        }
        System.out.println(count + " " + mult);*/

        /**
         * Даны два четырёхзначных числа A и B. Выведите все четырёхзначные числа
         * на отрезке от A до B, запись которых является палиндромом.
         */
        /*Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        for (int i = A; i < B; i++) {
            if ((i%10 == (i/1000)%10) && ((i/10)%10 == (i/100)%10)) {
                System.out.println(i);
            }
        }*/

        /**
         * Даны два четырёхзначных числа A и B. Выведите в порядке возрастания все четырёхзначные числа
         * на отрезке от A до B, запись которых содержит ровно три одинаковые цифры.
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ A");
        int A = scanner.nextInt();
        System.out.println("ВВЕДИТЕ B");
        int B = scanner.nextInt();
        for (int i = A; i <= B; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = ((i / 100) % 10);
            int d = ((i / 1000) % 10);
            if (a == b && b == c && a != d || a == c && c == d && a !=b || b == c && c == d && a !=d || a == b && b == d && c != a) {
                System.out.println(i);
            }
        }*/

        /**
         * По данному натуральном n вычислите сумму 1!+2!+3!+...+n!.
         * В решении этой задачи можно использовать только один цикл.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        int sum = 1;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum *= i ;
            sum2 += sum;
        }
        System.out.println(sum2);

        /**
         * Даны целые неотрицательные числа a, b, c, d. Выведите в порядке возрастания
         * все числа от a до b, которые дают остаток c при делении на d.
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();
        System.out.println("Введите d");
        int d = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i%d == c) {
                System.out.println(i);
            }
        }*/

        /**
         * Дано число n. Определить, является ли оно простым.
         * Простое число – число, имеющее ровно 2 делителя: оно само и единица
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                r++;
            }
        }
        if (r == 2) {
            System.out.println("Число простое");
        }
        else {
            System.out.println("Число не простое");
        }*/

        /**
         * Дано число n. Определить, является ли оно совершенным.
         * Совершенное число – число, равное сумме своих делителей без последнего числа
         */
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            System.out.println("Совершенное число");
        }
        else {
            System.out.println("Не совершенное число");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) { // строки
            for (int j = 0; j < n; j++) { //столбцы
                System.out.print("3 ");
            }
            System.out.println();
        }*/
        /**
         * Дано число r. Далее пользователь вводит ровно r
         * целых чисел с консоли. Для каждого введенного
         * числа посчитать произведение чисел от 1 жо этого числа
         */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int r = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < r; i++) {
            System.out.println("Введите целое число");
            int u = scanner.nextInt();
            sum += u;
            int p = 1;
            for (int j = 1; j <= u; j++) {
                p *= j;
            }
            System.out.println("Для числа " + u + " произведение от 1 до " + u + " равна " + p);
        }
        System.out.println(sum);*/


    }
}





