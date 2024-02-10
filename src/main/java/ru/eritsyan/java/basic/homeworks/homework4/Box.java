package ru.eritsyan.java.basic.homeworks.homework4;

public class Box {
    private int size;
    private String color;
    private boolean open;
    private String content;

    public Box(int size, String color, boolean open, String content) {
        this.size = size;
        this.color = color;
        this.open = open;
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;

    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void info() {
        System.out.println("Коробка размером " + size + ", цвет - " + color + ", содержимое - " + content + ", открыта - " + open);
    }

    public void put(String item) {
        if (open && content == null) {
            setContent(item);
            System.out.println("В коробку помещен " + item);
        } else {
            System.out.println("Box is closed or not empty");
        }

    }

    public void get() {
        if (open && content != null) {
            System.out.println(content + " извлечен из коробки, коробка пуста");
            this.content = null;
        } else {
            System.out.println("Box is closed or empty");
        }

    }
}
