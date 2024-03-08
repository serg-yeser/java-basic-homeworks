package ru.eritsyan.java.basic.homeworks.lesson11;

import java.util.ArrayList;
import java.util.List;


public class PersonDataBase {
    protected static List<Person> personSet = new ArrayList<>();

    public static Person findById(Long id) {
        for (int i = 0; i < personSet.size(); i++) {
            if (personSet.get(i).getId() == id) {
                System.out.println("Сотрудник найден:");
                personSet.get(i).print();
                return personSet.get(i);

            }
        }
        System.out.println("Сотрудник не найден");
        return null;
    }

    public static void add(Person person) {
        personSet.add(person);
    }

    public static boolean isManager(Person person) {
        if (person.getPosition().equals(Position.MANAGER)
                || person.getPosition().equals(Position.DIRECTOR)
                || person.getPosition().equals(Position.BRANCH_DIRECTOR)
                || person.getPosition().equals(Position.SENIOR_MANAGER)) {
            return true;
        }
        return false;
    }

    public static boolean isEmployee(Person person) {
        if (!isManager(person)) {
            return true;
        }
        return false;
    }

}
