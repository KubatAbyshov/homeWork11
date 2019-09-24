package com.company;

public class Main {

    public static void main(String[] args) {



//////////////////////////////////////////////////////////////////

        createObject("3");
        System.out.println("|||||||||||||||||||||||||||||");

///////////////////////////////////////////////////////////////////

        Beshbarmak beshbarmak = new Beshbarmak("Бешбармак", 200);
        beshbarmak.print();
        System.out.println("--------------------------");

        Cake cake = new Cake("Пирожное \"Наполеон\"", "Ужин");
        cake.print();
        System.out.println("--------------------------");

        Solyanka solyanka = new Solyanka("Солянка", "Колбаса, Оливки, Перец, Морковь");
        solyanka.print();
        System.out.println("--------------------------");

        Salad salad = new Salad("Греческий салат", 300);
        salad.print();
        System.out.println("--------------------------");


    }

    public static String createObject(String className) {


        switch (className) {
            case "2": {
                Beshbarmak besh = new Beshbarmak("Бешбармак", 200);
                System.out.println(besh.getName() + " " + besh.getCalories());
                break;
            }
            case "3": {
                Cake ca = new Cake("Пирожное \"Наполеон\"", "Ужин");
                System.out.println(ca.getName() + " " + ca.getEatingTime());
                break;
            }
            case "4": {
                Solyanka sol = new Solyanka("Солянка", "Колбаса, Оливки, Перец, Морковь");
                System.out.println(sol.getName() + " " + sol.getIngredients());
                break;
            }
            case "5": {
                Salad sal = new Salad("Греческий салат", 300);
                System.out.println(sal.getName() + " " + sal.getWeight());
            }

        }
        return className;
    }




}
