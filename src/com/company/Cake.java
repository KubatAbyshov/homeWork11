package com.company;

public class Cake extends Food implements Printable {

    private String name;
    private String eatingTime;

    public Cake(String name, String eatingTime) {
        this.name = name;
        this.eatingTime = eatingTime;
    }

    @Override
    public void print() {
        System.out.println(name + " - время приема: " + eatingTime);

    }

    public String getName() {
        return name;
    }

    public String getEatingTime() {
        return eatingTime;
    }
}
