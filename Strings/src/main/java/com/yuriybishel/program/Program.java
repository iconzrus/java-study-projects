package com.yuriybishel.program;

import com.yuriybishel.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String a = "aaaaaaa";
        System.out.println(a);
        String s = StringUtil.toUpperCase(a);
        System.out.println(s);

        String b = "Hello World Hetto World";
        String[] c = b.split(" ");
        System.out.println(Arrays.toString(c));

        String x = "234 chair 123";
        boolean b1 = StringUtil.hasLetter(x);
        System.out.println(b1);

        String z = "AAAAAAAAAA aAAAA";
        boolean b2 = StringUtil.hasUpperCase(z);
        System.out.println(b2);

        String z1 = "aaaaa A ";
        boolean b3 = StringUtil.hasLowerCase(z1);
        System.out.println(b3);

        String z2 = "fgff";
        boolean equals = StringUtil.equals(z1, z2);
        System.out.println(equals);

        String concat = StringUtil.concat(z1, z2);
        System.out.println(concat);

        String x2 = "zff";
        String substring = StringUtil.substring(x2,2, 8);
        System.out.println(substring);

        int i = StringUtil.compareTo(z2, x2);
        System.out.println(i);

        String s4 = StringUtil.randomString(110, false, false);
        System.out.println(s4);

        String h = "55 2323 2323";
        String stringDigit = StringUtil.getStringDigit(h);
        System.out.println(stringDigit);

        /*int anInt = StringUtil.parseInt(h);*/
        /*System.out.println(anInt);*/

        ArrayList<Integer> integers = StringUtil.parseIntegers(h);
        System.out.println(integers);

        String jj = "Hello world hello";
        int i1 = StringUtil.countWords(jj);
        System.out.println(i1);

        String sd = "Hello World Hello World";
        String asd = "Hello";
        String insert = StringUtil.insert(jj, sd, 5);
        System.out.println(insert);

        String substring1 = StringUtil.substring(jj, 6, 4);
        System.out.println(substring1);
        String s1 = StringUtil.substring2(jj, 3, 7);
        System.out.println(s1);
        String erase = StringUtil.erase(jj, 0, 4);
        System.out.println(erase);

        ArrayList<Integer> substringIndexes = StringUtil.getSubstringIndexes(sd, asd);
        System.out.println(substringIndexes);

    }

}

