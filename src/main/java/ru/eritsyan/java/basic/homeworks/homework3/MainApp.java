package ru.eritsyan.java.basic.homeworks.homework3;
public class MainApp {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[1][1];
        setArrayRandom(array);
        printArray(array);
        sumArray(array);
        printSquare(0);
        setArrayRandom(array1);
        zeroDiagonal(array1);
        printArray(array1);
        findMax(array1);
        secondRowSum(array1);
    }
    public static void setArrayRandom(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 12) - 5;
            }
            System.out.println();
        }
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void printSquare(int size) {
        if (size <= 0) {
            System.out.println("В качестве стороны необходимо ввести положительное число");
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }
    public static int[][] zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
    public static void findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива = " + max);
    }
    public static void secondRowSum(int[][] array) {
        int sum = 0;
        if (array.length < 2) {
            sum = -1;
            System.out.println("Второй строки нет, ответ " + sum);
            return;
        } else {
            for (int i = 1; i <= 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов второй строки = " + sum);
    }
}
