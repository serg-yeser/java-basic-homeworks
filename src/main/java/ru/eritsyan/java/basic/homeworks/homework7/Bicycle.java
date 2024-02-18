package ru.eritsyan.java.basic.homeworks.homework7;

public class Bicycle implements Move {
    public Bicycle() {
    }

    @Override
    public boolean move(int distance, RoadClass roadClass) {
        if (roadClass.equals(RoadClass.SWAMP)) {
            System.out.println("Велосипед не может передвигаться по " + roadClass);
            return false;
        } else {
            System.out.println("На велосипеде проехали " + distance + " км" + " по " + roadClass);
            return true;
        }
    }
}
