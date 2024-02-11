package ru.eritsyan.java.basic.homeworks.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 2, 11);
        Dog dog = new Dog("Шарик", 2, 15);
        Horse horse = new Horse("Пони", 4, 150);
        cat.info();
        dog.info();
        horse.info();
        System.out.println();
        horse.swimm(34);
        dog.swimm(3);
        cat.run(3);
        horse.swimm(33);
    }
}
