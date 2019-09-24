package com.company;

public class Salad extends Food implements Printable {

    private String name;
    private int weight;

    public Salad(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println(name + " - " + weight + " " + "гр");


    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
