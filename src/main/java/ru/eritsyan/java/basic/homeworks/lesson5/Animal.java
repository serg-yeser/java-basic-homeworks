package ru.eritsyan.java.basic.homeworks.lesson5;

public class Animal {
    // Создайте классы Cat, Dog и Horse с наследованием от класса Animal
    protected String name;
    protected int speed;
    protected int endurance;

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void info() {
        System.out.println(name + "- скорость: " + speed + ", выносливость: " + endurance);
    }

    public float run(int distance) {
        if (endurance <= 0) {
            System.out.println("Животное " + name + " устало и не может бегать");
            return -1;
        } else if (distance >= endurance) {
            System.out.println("Животное " + name + " устало бегать");
            endurance = 0;
            return -1;
        } else {
            endurance = endurance - distance;
            System.out.println("новая выносливость животного " + name + " после бега: " + endurance);
            info();
            System.out.println("Время бега: " + (float) distance / speed);
            System.out.println();
            return (float) distance / speed;
        }

    }
}
