package ru.eritsyan.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        minMax(3, 9);
        List<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 6, 5, 11));
        sum(integerArrayList);
        addDigit(5, integerArrayList);
        setDigit(4, integerArrayList);
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Petr", 55));
        employeeList.add(new Employee("Ivan", 33));
        employeeList.add(new Employee("Adam", 45));
        employeeNames(employeeList);
        employeeMinAge(35, employeeList);
        avgAge(44, employeeList);
        youngestEmployee(employeeList);
    }

    public static void minMax(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < (max - min + 1); i++) {
            arrayList.add(min + i);
        }
        System.out.println("Список из чисел между " + min + " и " + max + ":" + arrayList + "\n");

    }

    public static void sum(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 5) {
                sum += arrayList.get(i);
            }
        }
        System.out.println("Сумма элементов > 5 = " + sum + "\n");

    }

    public static void setDigit(int digit, List<Integer> arrayList) {
        System.out.println("Исходный массив: " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {

            arrayList.set(i, digit);

        }
        System.out.println("Новый массив со значением " + digit + " : " + arrayList + "\n");
    }

    public static void addDigit(int digit, List<Integer> arrayList) {
        System.out.println("Исходный массив: " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = arrayList.get(i) + digit;
            arrayList.set(i, temp);
        }
        System.out.println("Новый массив с добавлением  " + digit + " : " + arrayList + "\n");
    }

    public static void employeeNames(List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.print((i + 1) + ")" + employeeList.get(i).name + " ");
        }
        System.out.println();
    }

    public static void employeeMinAge(int age, List<Employee> employeeList) {
        System.out.print("Список сотрудников старше " + age + " : ");
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).age >= age) {
                System.out.print(employeeList.get(i).name + " ");
            }
        }
        System.out.println();
    }

    public static void avgAge(float avg, List<Employee> employeeList) {
        float sumAge = 0f;
        int count = 0;
        for (Employee employee : employeeList) {
            count++;
            sumAge += employee.age;
        }
        float avgAge = sumAge / count;
        if (avg > avgAge) {
            System.out.println("Средний возраст сотрудников " + avgAge + " меньше минимального среднего " + avg);
        } else {
            System.out.println("Средний возраст сотрудников " + avgAge + " больше минимального среднего " + avg);
        }

    }

    public static Employee youngestEmployee(List<Employee> employeeList) {
        Employee employee = new Employee("test", 100);
        for (Employee employee1 : employeeList) {
            if (employee1.age < employee.age) {
                employee = employee1;
            }
        }
        System.out.println("Самый молодой сотрудник : " + employee.name + ", возраст " + employee.age);
        return employee;
    }
}
