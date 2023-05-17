package com.yuriybishel.program;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * В среде разработки IntelliJ Idea создать новый maven проект с названием Variables
         * Проверить, чтобы структура проекта была следующая: com.вашНик.program.Program.
         * Если нет, то создать
         * Проверить, есть ли в классе запускающий метод main. Если нет, то создать
         * Документируемым комментарием в методе main показать данный текст задания
         * Создать переменные всех встроенных в Java типов данных, кроме char, и произвести
         * их инициализацию, используя Scanner
         * После объявления и инициализации всех переменных вывести на экран их значения через пробел
         * Объявить две константные переменные, проинициализировав их не со Scanner, а сразу же, в коде
         * Проверить, что константную переменную нельзя изменить после ее инициализации
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        System.out.println("Введите значение типа byte");
        byte b = scanner.nextByte();
        System.out.println("Введите значение типа short");
        short c = scanner.nextShort();
        System.out.println("Введите значение типа long");
        long d = scanner.nextLong();
        System.out.println("Введите значение типа float");
        float e = scanner.nextFloat();
        System.out.println("Введите значение типа double");
        double f = scanner.nextDouble();
        System.out.println("Введите значение типа boolean");
        boolean g = scanner.nextBoolean();
        System.out.println(a + " " + b + " " + c + " " + d +" " + e + " " + f + " " + g);

        //TODO константные переменные
    }
}