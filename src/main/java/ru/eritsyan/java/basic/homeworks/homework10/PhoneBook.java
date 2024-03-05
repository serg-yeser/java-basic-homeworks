package ru.eritsyan.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();

    public void add(String phone, String fio) {
        map.put(phone, fio);
    }

    public String find(String fio) {
        System.out.println("\nПоиск по имени - " + fio);
        if (map.isEmpty()) {
            return "Справочник пустой";
        }
        int counter = 0;
        String numbers = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(fio)) {
                numbers += "Найдено совпадение \n ФИО = " + entry.getValue() + ", номер: " + entry.getKey() + "\n";
                counter++;
            }
        }
        if (counter == 0) {
            return "Номер для " + fio + "не найден";
        } else {
            return numbers;
        }
    }

    public String containsPhoneNumber(String phone) {
        System.out.println("Проверка наличия номера " + phone + " в справочнике");
        if (map.isEmpty()) {
            return "Справочник пустой";
        }
        if (map.containsKey(phone)) {
            return "Номер " + phone + " есть в справочнике";
        } else {
            return "Номера " + phone + " нет в справочнике";
        }
    }

    public void print() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ФИО: " + entry.getValue() + ", телефон: " + entry.getKey());
        }
    }
}
