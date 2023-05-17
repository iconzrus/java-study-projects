package com.yuriybishel.util;

import java.util.ArrayList;
import java.util.Random;

public class StringUtil {
    /**
     * Дана строка. Перевести строку в верхний/нижний регистр
     */
    public static String toUpperCase(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            res += Character.toUpperCase(ch);
        }
        return res;
    }

    public static String toLowerCase(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            res += Character.toLowerCase(ch);
        }
        return res;
    }

    /**
     * Дана строка. Проверить является ли она числом
     */
    public static boolean isDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Дана строка, проверить является ли она словом
     *
     * @param string
     * @return
     */
    public static boolean isLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Дана строка, проверить содержит ли она хотя бы 1 слово
     */
    public static boolean hasLetter(String string) {
        String[] strings = string.split(" ");
        for (String s : strings) {
            if (isLetter(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Дана строка. Проверить содержит ли она только заглавные
     *
     * @param string
     * @return
     */
    public static boolean hasUpperCase(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isUpperCase(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Дана строка. Проверить содержит ли она только строчные буквы
     */
    public static boolean hasLowerCase(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isLowerCase(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Даны две строки, сравнить их на равенство.
     */
    public static boolean equals(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        for (int i = 0; i < string1.length(); i++) {
            char ch1 = string1.charAt(i);
            char ch2 = string2.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    /**
     * Даны две строки, не содержащие пробелов. Выведите конкатенацию этих строк
     */
    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * Дана строка и параметры i, k. Получить подстроку, начиная с символа с индексом i и длиной k.
     * Если i<0, или i≥s.size() или k<0, то функция должна возвращать пустую строку.
     * Если i+k≥s.size(), то возвращается строка длиной s.size()−i, то есть до конца строки.
     */
    public static String substring(String s, int i, int k) {
        if (i < 0 || i >= s.length() || k == 0) {
            return " ";
        }
        String res = "";
        if (i + k >= s.length()) {
            return s.substring(i);
        }
        for (int j = i; j < Math.min(i + k, s.length()); j++) {
            char ch = s.charAt(j);
            res += ch;
        }
        return res;
    }

    /**
     * Используя код предыдущей задачи, Получить подстроку, начиная с символа с индексом i по символ с индексом j.
     */
    public static String substring2(String s, int i, int j) {
        return substring(s, i, j - i);
    }

    /**
     * Дана строка и параметры i, k. Напишите функцию, которая удаляет из данной строки подстроку начиная
     * с символа с индексом i и длиной k.
     * Если i<0, или i≥s.size() или k<0, то функция не модифицирует исходную строку.
     * Если i+k≥s.size(), то удаляются все символы начиная с i-го до конца строки.
     * Решение оформить 2 способами:
     * -посимвольно
     * -через метод StringBuilder'a
     */
    //через substring
    public static String erase(String string, int i, int k) {
        if (i < 0 || i >= string.length() || k < 0) {
            return string;
        }
        if (i + k >= string.length()) {
            return substring(string, 0, i);
        }
        return substring(string, 0, i) + substring(string, k + i, string.length());
    }

    /**
     * Дана строка s, параметр i, другая строка t. Напишите функцию, которая вставляет в данную строку s начиная с индекса i строку t.
     * Если i<0 или i>s.size(), функция не модифицирует исходную строку.
     * Решение оформить 2 способами:
     * -посимвольно
     * -через метод StringBuilder'a
     */
    //ПОСИМВОЛЬНО
    public static String insert(String s, String t, int i) {
        if (i < 0 || i > s.length()) {
            return s;
        }
        String res1 = substring2(s, 0, i);
        String res2 = substring2(s, i, s.length());
        return res1 + t + res2;
    }


    /**
     * compareTo
     * Даны две строки. Сравнить строки лексикографически
     * Результат алгоритма:
     * - число > 0, если первая строка больше второй строки
     * - число < 0, если первая строка меньше второй строки
     * - число = 0, если строки равны
     * Указание:
     * - Методом линейного поиска найти индекс, с которого либо символы строк не равны между собой, либо достигнут
     * конец одной из строк. На основании данного индекса, сравнить строки лексикографически.
     * - Числа >0 (<0) возвращать либо как число насколько i-ый символ первой строки больше(меньше) второй,
     * либо 1 (-1) при достижении конца одной из строк соответственно.
     */
    public static int compareTo(String s, String t) {
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.charAt(i) - t.charAt(i);
            }
        }
        return Integer.compare(s.length(), t.length());
    }

    /**
     * Дано число n, и индикаторы f и k, написать метод, который сгенерирует случайную строку длиной n, состоящую только
     * из букв латинского алфавита и цифер, если индикатор f является истинным, тогда в строке могут с
     * одержаться только буквы, если индикатор k инстинный - цифры.
     */

    public static String randomString(int n, boolean f, boolean k) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String res = "";
        if (!f && !k) {
            res += alphabet + digits;
        } else if (f) {
            res += alphabet;
        } else {
            res += digits;
        }
        StringBuilder x = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int z = random.nextInt(res.length());
            char ch = res.charAt(z);
            x.append(ch);
        }
        return x.toString();
    }

    /**
     * Дана строка, возможно, содержащая пробелы. Извлеките из этой строки все символы, являющиеся цифрами и
     * составьте из них новую строку.
     */
    public static String getStringDigit(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                res += s.charAt(i);
            }
        }
        return res;
    }

    /**
     * Дана строка, содержащая любые символы и только одно числовое значение. Используя код предыдущей задачи,
     * преобразовать это числовое значение из строки в целое число, не используя операторы if и цикла
     */
    public static int parseInt(String s) {
        String stringDigit = getStringDigit(s);
        return Integer.parseInt(stringDigit);
    }

    /**
     * Дана строка, содержащая любые символы. Извлечь в виде массива целых чисел все числа
     * Пример:
     * Входные данные: 125оyhgf12p8
     * Выходные данные: [125, 12, 8]
     */
    public static ArrayList<Integer> parseIntegers(String s) {
        ArrayList<Integer> res = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    res.add(Integer.parseInt(number.toString()));
                    number = new StringBuilder();
                }
            }
        }
        if (number.length() > 0) {
            res.add(Integer.parseInt(number.toString()));
        }
        return res;
    }

    /**
     * Дано слово, состоящее только из заглавных и строчных латинских букв. Проверьте, верно ли что это слово
     * читается одинаково как справа налево, так и слева направо (то есть является палиндромом), если считать заглавные и строчные буквы не различающимися.
     */


    /**
     * Дана строка, содержащая только символы-цифры. Преобразовать данную строку в целое число
     */
    public static int integerValueOf(String s) {
        return Integer.parseInt(s);
    }

    /**
     * Дано целое число, перевести его в строку
     */
    public static String stringValueOf(int x) {
        return String.valueOf(x);
    }

    /**
     * Дана строка, возможно, содержащая пробелы. Определите количество слов в этой строке. Слово - это несколько
     * подряд идущих букв (как заглавных, так и строчных).
     */

    public static int countWords(String input) {
        String[] words = input.split(" ");
        int count = 0;
        for (String word : words) {
            if (isLetter(word)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Дана строка. Найдите в этой строке самое длинное слово и выведите его. Если в строке несколько слов одинаковой
     * максимальной длины, выведите первое из них.
     */
    public static String getLongestWord(String input) {
        String[] words = input.split(" ");
        String res = "";
        int maxLength = 0;

        for (String word : words) {
            if (isLetter(word) && word.length() > maxLength) {
                maxLength = word.length();
                res = word;
            }
        }
        return res;
    }

    /**
     * capitalization
     * Дана строка. Измените регистр символов в этой строке так, чтобы первая буква каждого слова была заглавной, а остальные буквы - строчными.
     * Указание:
     * Вынести в метод capitalizationWord изменение регистра одного слова, далее применить его ко всем словам в предложении.
     */

    public static String capitalizationWord(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public static String capitalization(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += capitalizationWord(words[i]);
        }
        return result;
    }

    /**
     * replace
     * Дана строка s, и две других строки t, u. Напишите функцию, которая заменяет в данной строке s подстроку t на строку u.
     * Указание:
     * Использовать код из предыдущей задачи, чтобы определить индексы всех вхождений строки t в строку s
     *
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







