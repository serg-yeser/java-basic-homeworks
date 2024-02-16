package ru.eritsyan.java.basic.homeworks.homework6;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(15);
        Cat[] cat = new Cat[4];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("name" + i, i + 3);
            cat[i].info();
            cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
        plate.setFood(1);
        plate.getFood(122);
    }
}
