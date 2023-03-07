package org.example.Keyword;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 44, "$$$$");
        Hero hero2 = new Hero("Superman", 33, "everything");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println(hero2.toString());
    }
}
