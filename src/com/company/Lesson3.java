package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {

        String str = "aaa";

        System.out.println(str.substring(1));

        int[] values = {6, 2, 10, 3, 5, 8, 13};
        System.out.println(values.length);
        System.out.println(Arrays.binarySearch(values, 5));
        System.out.println(Arrays.binarySearch(values,8));
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        Arrays.fill(values,777);
        System.out.println(Arrays.toString(values));

    }

    private static void stringExample1() {

        String str1 = "abc";
        String str2 = new String(new char[]{'a', 'b', 'c'});

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("bc"));

        System.out.println("a" + "b" + "d");

        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i != 10; i++) {
            tmp.append(i).append("_");
        }
        System.out.println(tmp);
    }


    private static void arrayExample1() {
        int[] anArray1 = new int[10];
        int[] anArray2 = {0, 1, 2, 3};
        MyClass[] objArray = new MyClass[5];
        System.out.println(objArray.toString());
        for (int i = 0; i != objArray.length; i++) {
            objArray[i] = new MyClass(i);
            System.out.println((objArray[i]));
        }
    }

    private static void arrayExample() {
        Object myClass1 = new MyClass(1);
        System.out.println(myClass1.toString());
        Object myClass2 = new MyClass(1);
        System.out.println(myClass2.toString());
        System.out.println(myClass1 == myClass2);
        System.out.println(myClass1.equals(myClass2));
    }
}

