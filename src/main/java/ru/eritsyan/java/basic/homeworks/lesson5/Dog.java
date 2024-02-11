package ru.eritsyan.java.basic.homeworks.lesson5;

public class Dog extends Animal {
    public Dog(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    public float swimm(int distance) {
        if (endurance <= 0) {
            System.out.println("Собака " + name + " устала и не может плавать");
            return -1;
        } else if (distance >= endurance / 2) {
            System.out.println("Собака " + name + " устала плавать");
            endurance = 0;
            return -1;
        } else {
            endurance = endurance - 2 * distance;
            System.out.println("новая выносливость собаки " + name + " после плавания: " + endurance);
            info();
            System.out.println("Время плавания собаки: " + (float) distance / speed);
            System.out.println();
            return (float) distance / speed;
        }

    }
}
