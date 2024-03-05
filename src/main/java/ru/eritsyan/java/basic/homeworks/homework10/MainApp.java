package ru.eritsyan.java.basic.homeworks.homework10;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.containsPhoneNumber("3"));
        System.out.println(phoneBook.find("fio1"));
        phoneBook.add("1", "fio1");
        phoneBook.add("2", "fio2");
        phoneBook.add("22", "fio2");
        phoneBook.add("3", "fio3");
        phoneBook.add("4", "fio4");
        phoneBook.print();
        System.out.println(phoneBook.containsPhoneNumber("3"));
        System.out.println(phoneBook.find("fio2"));
    }


}
