package ru.eritsyan.java.basic.homeworks.lesson11;

import java.util.Arrays;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<Long, Person> personMap = PersonDataBase.personMap;
        PersonDataBase.findById(1L);
        PersonDataBase.add(1L, new Person("Ivan", Position.DIRECTOR, 1L));
        PersonDataBase.add(2L, new Person("Petr", Position.QA, 2L));
        PersonDataBase.add(3L, new Person("Nick", Position.BRANCH_DIRECTOR, 3L));
        System.out.println(personMap);
        PersonDataBase.findById(1L);
        PersonDataBase.findById(4L);
        System.out.println(PersonDataBase.isManager(PersonDataBase.findById(3L)));
        System.out.println(PersonDataBase.isManager(PersonDataBase.findById(2L)));
        System.out.println(PersonDataBase.isEmployee(PersonDataBase.findById(2L)));
        System.out.println(PersonDataBase.isEmployee(PersonDataBase.findById(3L)));
        int[] array = {2, 5, 8, 3, 5, 1, 8, 3, 9, 0};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    changed = true;
                    int buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                }
            }
            if (!changed) {
                break;
            }
        }
    }

}
