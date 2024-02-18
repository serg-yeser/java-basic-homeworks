package ru.eritsyan.java.basic.homeworks.homework7;

public class Man {
    private String name;
    private TransportType currentTransport;
    private Car car = new Car(100);
    private Horse horse = new Horse(30);
    private Rover rover = new Rover(100);
    private Bicycle bicycle = new Bicycle();

    public Man(String name) {
        this.name = name;
        this.currentTransport = TransportType.EMPTY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getCurrentTransport() {
        return currentTransport;
    }

    public boolean setCurrentTransport(TransportType currentTransport) {
        if (this.currentTransport != TransportType.EMPTY) {
            System.out.println(name + " уже сидит на транспорте " + this.currentTransport);
            return false;
        } else {
            this.currentTransport = currentTransport;
            System.out.println(name + " сел на транспорт " + currentTransport);
            return true;
        }

    }

    public void standUpFromTransport() {
        System.out.println(name + " встал с транспорта " + currentTransport);
        currentTransport = TransportType.EMPTY;
    }

    public void info() {
        System.out.println("Имя: " + name + ", транспорт: " + currentTransport);
    }


    public boolean moveMan(int distance, RoadClass roadClass, TransportType transportType) {
        if (setCurrentTransport(transportType)) {
            if (currentTransport == TransportType.EMPTY) {
                System.out.println(name + " прошел " + distance + " км пешком по местности " + roadClass);
                return true;
            } else if (currentTransport == TransportType.BICYCLE) {
                return bicycle.move(distance, roadClass);
            } else if (currentTransport == TransportType.CAR) {
                return car.move(distance, roadClass);
            } else if (currentTransport == TransportType.HORSE) {
                return horse.move(distance, roadClass);
            } else {
                return rover.move(distance, roadClass);
            }
        } else {
            System.out.println("Не можем проехать на данном транспорте (" + transportType + ") , т.к. " + name + " сидит на другом - " + currentTransport);
            System.out.println("Сначала встаньте с текущего транспорта");
            return false;
        }

    }
}
