package ru.eritsyan.java.basic.homeworks.homework6;

public class Plate {
    private int currentCapacity;
    private int maxCapacity;

    public Plate(int maxCapacity) {
        this.currentCapacity = maxCapacity;
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void info() {
        System.out.println("В тарелке " + currentCapacity + " из " + maxCapacity);
    }

    public boolean getFood(int food) {
        if (currentCapacity - food < 0) {
            currentCapacity = 0;
            System.out.println("В тарелке кончилась еда");
            return false;
        } else {
            currentCapacity -= food;
            System.out.println("В тарелке осталось еды: " + currentCapacity);
            return true;
        }
    }

    public void setFood(int food) {
        if (currentCapacity + food > maxCapacity) {
            currentCapacity = maxCapacity;
            System.out.println("Тарелка полностью заполнена");
        } else {
            currentCapacity += food;
            System.out.println("В тарелке теперь еды: " + currentCapacity + " из " + maxCapacity);
        }

    }

}
