package ru.eritsyan.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class mainApplication {
    public static void main(String[] args) {
//        greetings();
//        checkSign(4, -6, 1);
//        selectColor(11);
//        compareNumbers(4, 6);
//        addOrSubtractAndPrint(4, 1, false);
        System.out.println("Введите число от одного до пяти:");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if (d == 1) {
            greetings();
        } else if (d == 2) {
            int a = (int) (Math.random() * 20) - 10;
            int b = (int) (Math.random() * 20) - 10;
            int c = (int) (Math.random() * 20) - 10;
            checkSign(a, b, c);
        } else if (d == 3) {
            int aa = (int) (Math.random() * 30);
            selectColor(aa);
        } else if (d == 4) {
            int bb = (int) (Math.random() * 20) - 10;
            int cc = (int) (Math.random() * 20) - 10;
            compareNumbers(bb, cc);
        } else if (d == 5) {
            int aaa = (int) (Math.random() * 20) - 10;
            int bbb = (int) (Math.random() * 20) - 10;
            if (Math.random() < 0.5) {
                boolean ccc = true;
                addOrSubtractAndPrint(aaa, bbb, ccc);
            } else {
                boolean ccc = false;
                addOrSubtractAndPrint(aaa, bbb, ccc);

            }

        } else {
            System.out.println("Некорректный ввод, введите число от одного до пяти");
        }

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        System.out.println("data=" + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }


    }

    public static void compareNumbers(int a, int b) {
        System.out.println("a=" + a + ", b=" + b);
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("initValue=" + initValue + ",delta=" + delta + ",increment=" + increment);
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }

    }
}
