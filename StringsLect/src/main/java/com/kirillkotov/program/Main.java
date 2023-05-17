package com.kirillkotov.program;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char ch1 = 'r';
        char ch2 = '5';
        char ch3 = '~';
        int c1 = ch1;
        int c2 = ch2;
        int c3 = ch3;
        System.out.println("ch1: " + c1);
        System.out.println("\nch2: " + c2);
        System.out.println("\nch3: " + c3);

        char ch7 = 123;
        char ch8 = '\uD83C';
        System.out.println("\nch7(from int code): " + ch7);
        System.out.println("\nch8(from hex code): " + ch8);

        char ch4 = '~';
        if (ch3 == ch4) {
            System.out.println("\nch1 = ch4");
        } else {
            System.out.println("\nch1 != ch4");
        }

        if (ch3 != ch2) {
            System.out.println("\nch3 = ch4");
        } else {
            System.out.println("\nch3 != ch4");
        }

        if (ch1 >= 'a') {
            System.out.println("\nch1 >= a");
        } else {
            System.out.println("\n!(ch1 >= a)");
        }

        if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println("\na <= ch1 <= z");
        } else {
            System.out.println("\n!(a <= ch1 <= z)");
        }

        char ch5 = (char) (ch1 + 1);
        System.out.println(ch5);

        boolean isLetter = Character.isLetter('a');
        System.out.println("\na isLetter: " + isLetter);

        boolean isDigit = Character.isDigit('5');
        System.out.println("\n5 isDigit: " + isDigit);

        boolean isUpperCase = Character.isUpperCase('A');
        System.out.println("\nA isUpperCase: " + isUpperCase);

        boolean isLowerCase = Character.isLowerCase('a');
        System.out.println("\na isLowerCase: " + isLowerCase);

        char toLowerCase = Character.toLowerCase('A');
        System.out.println("\nA toLowerCase: " + toLowerCase);

        char toUpperCase = Character.toUpperCase('a');
        System.out.println("\na toUpperCase: " + toUpperCase);

        int digit = Character.digit('5', 10);
        System.out.println("\n5 to digit: " + digit);

        int a1 = Character.digit('A', 16);
        System.out.println("\nA from hex number: " + a1);

        int compare = Character.compare(ch1, ch2);
        System.out.println("\nResult of compare symbols: " + compare);

        String a = "Hello World";
        System.out.println("\nPrint string a: " + a);

        String lowerCase = a.toLowerCase();
        System.out.println("\nString toLowerCase");
        System.out.println(lowerCase);

        String upperCase = a.toUpperCase();
        System.out.println("\nString toUpperCase");
        System.out.println(upperCase);

        String b = "Hello World Hello";
        boolean equals = a.equals(b);
        //a.equalsIgnoreCase(b);
        System.out.println("\nStrings equals: " + equals);

        int length = a.length();
        System.out.println("\nString length: " + length);

        String c = "Hetto";
        int i = a.compareTo(c);
        //a.compareToIgnoreCase(b);
        System.out.println("\nString compare: " + i);

        char c4 = a.charAt(0);
        System.out.println("\nGet char from index: " + c4);

        String d = "Hello";
        boolean contains = a.contains(d);
        System.out.println("\nResult of contains: " + contains);

        boolean startsWith = a.startsWith(d);
        System.out.println("\nResult of startsWith: " + startsWith);

        boolean endsWith = a.endsWith(d);
        System.out.println("\nResult of endsWith: " + endsWith);

        String indent = a.indent(5);
        System.out.println("\nIndent at start:\n" + indent);

        int indexOf1 = a.indexOf(d);
        System.out.println("\nFirst index of occurrence: " + indexOf1);

        int indexOf2 = b.indexOf(d, 1);
        System.out.println("\nFirst index of occurrence starting 1 index: " + indexOf2);

        int lastIndexOf1 = b.lastIndexOf(d);
        System.out.println("\nLast index of occurrence: " + lastIndexOf1);

        String repeat = a.repeat(5);
        System.out.println("\nRepeat string: " + repeat);

        a = a.replace("Hello", "tt");
        System.out.println("\nString replace: " + a);

        String e = "      dfghjk\t\t\r\n    ";
        String strip = e.strip();
        System.out.println("\nString strip(remove unused characters): " + strip);

        String substring1 = a.substring(2);
        System.out.println("\nSubstring from start index to end of string: " + substring1);

        String substring2 = a.substring(2, 7);
        System.out.println("\nSubstring from 2 index to 6 including: " + substring2);

        boolean empty = a.isEmpty();
        System.out.println("\nString is empty: " + empty);

        String t = "Hello World \nHello";
        String[] split = t.split("[ \n]");
        System.out.println("\nResult of split: " + Arrays.toString(split));

        String concat = a + b;
        System.out.println("\nResult of concat strings: " + concat);

        String россия = t.replaceAll("[^A-Za-z]", "Россия");
        System.out.println("\nResult of replace regex: " + россия);

        String g = "Hello World \t World";
        String replaceFirst = g.replaceFirst("[^A-Za-z]", "Россия");
        System.out.println("\nResult of first replace regex: " + replaceFirst);

        for (int j = 0; j < a.length(); j++) {
            char ch = a.charAt(j);
            System.out.print(ch + " ");
        }

        byte[] getBytes = a.getBytes();
        System.out.println("\n\nGet bytes from string: " + Arrays.toString(getBytes));

        byte[] mass = {100, 80, 100, 127, 45};
        String str = new String(mass);
        System.out.println("\nString from bytes: " + str);

        String pineApple = "\uD83C\uDF4D";
        System.out.println("\nEmoji from characters: " + pineApple);
        byte[] bytes = pineApple.getBytes();
        System.out.println("\nEmoji bytes: " + Arrays.toString(bytes));
        System.out.println("\nEmoji chars length: " + pineApple.length());


    }
}