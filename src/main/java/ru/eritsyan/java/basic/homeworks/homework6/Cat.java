package ru.eritsyan.java.basic.homeworks.homework6;

public class Cat {
    String name;
    int appetite;

    boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }


    public int getAppetite() {
        return appetite;
    }


    public boolean isHungry() {
        return isHungry;
    }

    public void info() {
        System.out.println("Имя: " + name + ", аппетит:" + appetite + ", голоден?" + isHungry);
        System.out.println();
    }

    public void eat(Plate plate) {
        if (!isHungry) {
            System.out.println("Кот " + name + " не голоден");
        }
        if (appetite > plate.getCurrentCapacity()) {
            System.out.println("Еды не хватает");
        } else {
            System.out.println("Кот " + name + " съел " + appetite + " еды");
            plate.getFood(appetite);
            isHungry = false;
            plate.info();
        }
        System.out.println();
    }
}
