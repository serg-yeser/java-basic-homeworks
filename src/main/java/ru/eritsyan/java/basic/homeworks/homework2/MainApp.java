package ru.eritsyan.java.basic.homeworks.homework2;

import java.util.Arrays;
public class MainApp {
    public static void main(String[] args) {
        printString(1, "Java.Lesson");
        sumCount(1, 2, 3, 4, 5, 6, 7);
        int[] array1 = new int[10];
        System.out.println(Arrays.toString(array1));
        arrayFill(4, array1);
        int[] array2 = {1, 1, 2, 3, 4, 2};
        arrayAdd(5, array2);
        int[] array3 = {1, 1, 2, 3, 4, 2};
        compare(array3);
    }

    public static void printString(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void sumCount(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static void arrayFill(int value, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayAdd(int value, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void compare(int... array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }
        System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2);
        if (sum1 > sum2) {
            System.out.println("Сумма элементов первой половины массива больше суммы второй половины");
        } else if (sum2 > sum1) {
            System.out.println("Сумма элементов второй половины массива больше суммы первой половины");
        } else {
            System.out.println("Сумма элементов первой половины равна сумме элементов второй половины");
        }
    }
}
