package com.company;

public class Solyanka extends Food implements Printable {

    private String name;
    private String ingredients;

    public Solyanka(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public void print() {
        System.out.println(name + " ингредиенты: " + ingredients);

    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }
}
