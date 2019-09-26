package com.company;

public class Salad extends Food implements Printable {


    private int weight;

    public Salad( int weight) {
       setName("Salad");
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println( getName()+ " - " + weight + " " + "гр");


    }
}
