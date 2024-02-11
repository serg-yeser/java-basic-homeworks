package ru.eritsyan.java.basic.homeworks.lesson5;

public class Horse extends Animal {
    public Horse(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }
    public float swimm(int distance) {
        if (endurance <= 0) {
            System.out.println("Лошадь " + name + " устала и не может плавать");
            return -1;
        } else if (distance >= endurance / 4) {
            System.out.println("Лошадь " + name + " устала плавать");
            endurance = 0;
            return -1;
        } else {
            endurance = endurance - 4 * distance;
            System.out.println("новая выносливость лошади " + name + " после плавания: " + endurance);
            info();
            System.out.println("Время плавания лошади: " + (float) distance / speed);
            System.out.println();
            return (float) distance / speed;
        }

    }
}
