package com.yuriybishel.program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * В среде разработки IntelliJ Idea создать новый maven проект с названием InputOutputFormat
         * Проверить, чтобы структура проекта была следующая: com.вашНик.program.Program. Если нет, то создать
         * Ввести с консоли переменные типов: long, int, double, float, char, String
         * Вывести на экран, используя команду System.out.printf
         * форматированный текст использованием этих переменных так, чтобы:
         * Целые переменные имели минимальное количество знаков: 2, а недостающие заполнялись автоматически нулями
         * Вещественные переменные имели не более двух знаков после запятой
         * Сформировать новую строку, используя String.format по алгоритму, описанному выше, вывести ее на экран.
         */

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long b = scanner.nextLong();
        double c = scanner.nextDouble();
        float d = scanner.nextFloat();
        char e = 'd';
        System.out.printf("%02d %02d %.2f %.2f \n", a, b, c, d);
        String x = String.format("%02d %02d %.2f %.2f", a, b, c, d);
        System.out.println(x);






    }
}