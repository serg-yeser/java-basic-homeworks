package ru.eritsyan.java.basic.homeworks.homework7;

public class Rover implements Move {
    private int gasVolume;

    public int getGasVolume() {
        return gasVolume;
    }

    public void setGasVolume(int gasVolume) {
        this.gasVolume = gasVolume;
    }

    public Rover(int gasVolume) {
        this.gasVolume = gasVolume;
    }

    @Override
    public boolean move(int distance, RoadClass roadClass) {
        if (distance > gasVolume) {
            System.out.println("Вездеходу не хватит топлива для преодоления дистанции " + distance + " км");
            return false;
        } else {
            System.out.println("Вездеход проехал " + distance + " км" + " по " + roadClass);
            gasVolume -= distance;
            return true;
        }

    }
}
