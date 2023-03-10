package org.example;

import java.util.ArrayList;

public class Bro_Code_Excercices {
    public static void main(String[] args) {
        //ArrayList - listy
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String>bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");
        System.out.println(drinksList);

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(1).get(0));

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");

        food.set(2,"sushi");
        food.remove(2);
        // food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        //Foreach = 2 sposoby przez pętlę lub wyciąganie z ArrayList
        String [] animals = {"cat", "dog", "rat", "bird"};
        for (String i : animals){
            System.out.print(i + ", ");
        }
        System.out.println();
        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("shark");
        animals2.add("elephant");
        animals2.add("mouse");
        animals2.add("giraph");
        for (String i2 : animals2){
            System.out.print(i2 + ", ");
        }
    }
}
