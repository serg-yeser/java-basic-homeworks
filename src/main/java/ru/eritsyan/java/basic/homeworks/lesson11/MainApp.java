package ru.eritsyan.java.basic.homeworks.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Person> personSet = PersonDataBase.personSet;
        PersonDataBase.add(new Person("Ivan", Position.DRIVER, 1L));
        PersonDataBase.add(new Person("Petr", Position.MANAGER, 2L));
        PersonDataBase.add(new Person("Nick", Position.QA, 3L));
        PersonDataBase.add(new Person("Vick", Position.BRANCH_DIRECTOR, 4L));
        System.out.println(personSet);
        System.out.println(personSet.get(0).getPosition());
        PersonDataBase.findById(5L);
        PersonDataBase.findById(3L);
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
