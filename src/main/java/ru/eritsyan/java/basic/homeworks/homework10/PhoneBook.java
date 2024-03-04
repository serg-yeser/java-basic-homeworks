package ru.eritsyan.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();

    public void add(String phone, String fio) {
        map.put(phone, fio);
    }

    public void find(String fio) {
        System.out.println("\nПоиск по имени - " + fio);
        if (map.isEmpty()) {
            System.out.println("Справочник пустой");
            return;
        }
        int counter = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(fio)) {
                System.out.println("Найдено совпадение \n ФИО = " + entry.getValue() + ", номер: " + entry.getKey());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Номер для " + fio + "не найден");
        }
    }

    public void containsPhoneNumber(String phone) {
        System.out.println("Проверка наличия номера " + phone + " в справочнике");
        if (map.isEmpty()) {
            System.out.println("Справочник пустой");
            return;
        }
        if (map.containsKey(phone)) {
            System.out.println("Номер " + phone + " есть в справочнике");
        } else {
            System.out.println("Номера " + phone + " нет в справочнике");
        }
    }

    public void print() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ФИО: " + entry.getValue() + ", телефон: " + entry.getKey());
        }
    }
}
