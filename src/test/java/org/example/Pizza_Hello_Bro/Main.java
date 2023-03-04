package org.example.Pizza_Hello_Bro;

public class Main {
    public static void main(String[] args) {
        //Metody przeciążone - z różną ilością parametrów
        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        Pizza pizza1 = new Pizza("tomato","gouda","mayonnaise");
    }
}
