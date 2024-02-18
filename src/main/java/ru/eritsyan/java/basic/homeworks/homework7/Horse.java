package ru.eritsyan.java.basic.homeworks.homework7;

public class Horse implements Move {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public boolean move(int distance, RoadClass roadClass) {
        if (roadClass.equals(RoadClass.SWAMP)) {
            System.out.println("Лошадь не может передвигаться по " + roadClass);
            return false;
        } else if (distance > power) {
            System.out.println("Лошади не хватит сил для преодоления дистанции " + distance + " км");
            return false;
        } else {
            System.out.println("Лошадь проскокала " + distance + " км");
            power -= distance;
            return true;
        }
    }
}
