package com.company;

public class Cake extends Food implements Printable {

    private String eatingTime;

    public Cake( String eatingTime) {
        setName("Cake");
        this.eatingTime = eatingTime;
    }

    @Override
    public void print() {
        System.out.println( getName()+ " - время приема: " + eatingTime);

    }
}
