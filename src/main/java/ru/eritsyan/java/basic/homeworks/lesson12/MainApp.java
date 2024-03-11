package ru.eritsyan.java.basic.homeworks.lesson12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class MainApp {
    public static void main(String[] args) {
        File path = new File("\\D:\\java-basic-homeworks\\src");
        System.out.println("file.listFiles() = " + Arrays.toString(path.listFiles(File::isFile)));
        System.out.println("Введите имя файла из списка(полный путь):");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        fileName = checkFileName(fileName,scanner);
        System.out.println("\n Содержимое файла: ");
        readCoding(fileName);
        addData(fileName, "\nsome extra data" + random(1));
        System.out.println();
        readCoding(fileName);
    }

    public static void readCoding(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis);) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addData(String fileName, String newData) {
        String data = newData;
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String checkFileName(String fileName, Scanner scanner) {
        File file = new File(fileName);
        while (!file.exists()) {
            System.out.println("Введено некорректное имя, повторите ввод");
            fileName = scanner.next();
            file = new File(fileName);
        }
        return fileName;
    }

}

