package ru.eritsyan.java.basic.homeworks.lesson11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    protected static Map<Long, Person> personMap = new HashMap<>();

    public static Person findById(Long id) {
        if (personMap.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return null;
        }
        if (personMap.containsKey(id)) {
            System.out.println("Сотрудник " + personMap.get(id).toString() + "найден");
            return personMap.get(id);
        }
        System.out.println("Сотрудник не найден");
        return null;
    }


    public static void add(Long id, Person person) {
        personMap.put(id, person);
    }

    public static boolean isManager(Person person) {
        return (person.getPosition().equals(Position.MANAGER)
                || person.getPosition().equals(Position.DIRECTOR)
                || person.getPosition().equals(Position.BRANCH_DIRECTOR)
                || person.getPosition().equals(Position.SENIOR_MANAGER));
    }

    public static boolean isEmployee(Person person) {
        return (!isManager(person));
    }

}
