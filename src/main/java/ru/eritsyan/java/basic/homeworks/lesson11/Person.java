package ru.eritsyan.java.basic.homeworks.lesson11;

public class Person {
    private String name;
    private Position position;
    private Long id;

    public Person(String name, ru.eritsyan.java.basic.homeworks.lesson11.Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void print() {
        System.out.println("Name: " + name + ", position: " + position + ", id: " + id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", id=" + id +
                '}';
    }

}
