package ru.eritsyan.java.basic.homeworks.homework8;


public class MainApp8 {

    public static void main(String[] args) {
        String[] arraySum = new String[]{"33", "22", "22","-1"};
        arraySum(arraySum);
        String[][] array = new String[4][4];
        arraySizeCheck(array);

    }

    public static void arraySizeCheck(String[][] array) throws AppArraySizeException {
        if (array.length != 4) {
            throw new AppArraySizeException("Кол-во строк массива не равно 4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Кол-во столбцов массива не равно 4");
            }
        }
        System.out.println("Размер массива корректный");
    }


    static class AppArraySizeException extends ArrayIndexOutOfBoundsException {
        public AppArraySizeException(String message) {

            super(message);
        }
    }

    static class AppArrayDataExeption extends NumberFormatException {
        public AppArrayDataExeption(String message) {

            super(message);
        }
    }

    public static void arraySum(String[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                sum += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                throw new AppArrayDataExeption("Некорректные данные - " + (i + 1) + " элемент");
            }
        }
        System.out.println("Сумма равна " + sum);
    }

}

