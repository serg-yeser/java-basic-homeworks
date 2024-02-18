package ru.eritsyan.java.basic.homeworks.homework7;

public class Car implements Move {
    private int gasVolume;

    public Car(int gasVolume) {
        this.gasVolume = gasVolume;
    }

    public int getGasVolume() {
        return gasVolume;
    }

    public void setGasVolume(int gasVolume) {
        this.gasVolume = gasVolume;
    }

    @Override
    public boolean move(int distance, RoadClass roadClass) {
        if (roadClass.equals(RoadClass.SWAMP) || roadClass.equals(RoadClass.FORREST)) {
            System.out.println("Машина не может передвигаться по " + roadClass);
            return false;
        } else if (distance > gasVolume) {
            System.out.println("Машине не хватит топлива для преодоления дистанции " + distance + " км");
            return false;
        } else {
            System.out.println("Машина проехала " + distance + " км");
            gasVolume -= distance;
            return true;
        }
    }
}
