package com.company;

public class Solyanka extends Food implements Printable {


    private String ingredients;

    public Solyanka( String ingredients) {
        setName("Solyanka");
        this.ingredients = ingredients;
    }

    @Override
    public void print() {
        System.out.println(getName() + " ингредиенты: " + ingredients);

    }

}
