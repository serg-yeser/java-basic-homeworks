package ru.eritsyan.java.basic.homeworks.homework4;

public class User {
    private String surName;
    private String name;
    private String secondName;
    private String birthYear;
    private String email;
    public User(String surName, String name, String secondName, String birthYear, String email) {
        this.surName = surName;
        this.name = name;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.email = email;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void info(){
        System.out.println("ФИО: " + surName + " "+ name + " " + secondName);
        System.out.println("Год рождения: " + birthYear + "\n e-mail: " + email + "\n") ;
    }
}
