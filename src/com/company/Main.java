package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cake").print();
        createObject("Salad").print();
        createObject("Solyanka").print();

    }


    public static Printable createObject(String className) {
        Printable printable=null;
        switch (className) {
            case "Cake":
                printable = new Cake("Ужин");
                break;
            case "Salad":
                printable = new Salad(200);
                break;
            case "Solyanka":
                printable = new Solyanka("Колбаса, Морковь");
                break;
        }
        return printable;


    }
}
