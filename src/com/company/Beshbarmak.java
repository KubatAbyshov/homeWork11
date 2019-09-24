package com.company;

public class Beshbarmak extends Food implements Printable {

    private String name;
    private int calories;

    public Beshbarmak(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public void print() {
        System.out.println(name + " - " + calories + " килокалории");

    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
