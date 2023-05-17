package com.Strings;

import java.util.ArrayList;

public class StringBuilderUtil {
    /**
     *
     * Дана строка s, параметр i, другая строка t. Напишите функцию, которая вставляет в данную строку s начиная с индекса i строку t.
     * Если i<0 или i>s.size(), функция не модифицирует исходную строку.
     */

    public static String insert(String s, String t, int i) {
        if (i < 0 || i > s.length()) {
            return s;
        }
        StringBuilder res = new StringBuilder(s);
        res.insert(i, t);
        return res.toString();
    }

    /**
     * Дана строка и параметры i, k. Напишите функцию, которая удаляет из данной строки подстроку начиная с
     * символа с индексом i и длиной k.
     * Если i<0, или i≥s.size() или k<0, то функция не модифицирует исходную строку.
     * Если i+k≥s.size(), то удаляются все символы начиная с i-го до конца строки.
     */

    public static String erase(String s, int i, int k) {
        if (i < 0 || i >= s.length()) {
            return s;
        }
        StringBuilder res = new StringBuilder(s);
        if ((i + k) >= s.length()) {
            res.delete(i, s.length());
            return res.toString();
        }
        res.delete(i, i + k);
        return res.toString();
    }

    /**
     * Дана строка s, и две других строки t, u. Напишите функцию, которая заменяет в данной строке s подстроку t на строку u.
     * Указание:
     * Использовать код из предыдущей задачи, чтобы определить индексы всех вхождений строки t в строку s
     */

    public static ArrayList<Integer> getSubstringIndexes(String input, String substring) {
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = input.indexOf(substring);
        while (index != -1){
            indexes.add(index);
            index = input.indexOf(substring, index + 1);
        }
        return indexes;
    }

    public static String replace(String s, String t, String u) {
        ArrayList<Integer> indexes = getSubstringIndexes(s, t);
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < indexes.size(); i++) {
            int index = indexes.get(i);
            result.replace(index, index + t.length(), u);
        }
        return result.toString();
    }

    /**
     * Произвести разворот строки
     */
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Заменить символ по указанному индексу в строке
     */
    public static String replaceChar(String s, int index, char c) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(index, c);
        return sb.toString();
    }

    /**
     * Произвести цикличное накопление чисел от 1 до n, получив в конце строку
     */
    public static String String(String s, int n) {
        StringBuilder res = new StringBuilder(s);
        for (int i = 1; i <= n; i++) {
            res.append(i);
        }
        return res.toString();
    }

}
