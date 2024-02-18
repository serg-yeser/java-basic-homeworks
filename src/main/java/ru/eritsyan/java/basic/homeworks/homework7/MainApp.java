package ru.eritsyan.java.basic.homeworks.homework7;

public class MainApp {
    public static void main(String[] args) {
        Car car = new Car(100);
        Horse horse = new Horse(30);
        Rover rover = new Rover(100);
        Bicycle bicycle = new Bicycle();
        Man man = new Man("OLEG");
        man.info();
        car.move(1000, RoadClass.PLAIN);
        car.move(1, RoadClass.SWAMP);
        horse.move(2, RoadClass.PLAIN);
        horse.move(2, RoadClass.SWAMP);
        rover.move(3, RoadClass.FORREST);
        bicycle.move(4, RoadClass.FORREST);
        bicycle.move(4, RoadClass.SWAMP);
        man.moveMan(10, RoadClass.FORREST, TransportType.ROVER);
        man.moveMan(10, RoadClass.FORREST, TransportType.BICYCLE);
        man.info();
        man.standUpFromTransport();
        man.info();
        man.moveMan(1000, RoadClass.SWAMP, TransportType.ROVER);
        man.moveMan(22, RoadClass.SWAMP, TransportType.EMPTY);
    }
}
