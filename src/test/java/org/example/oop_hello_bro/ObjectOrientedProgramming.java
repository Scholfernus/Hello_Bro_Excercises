package org.example.oop_hello_bro;

import org.example.oop_source.DiceRoller;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        System.out.println(myCar.model.concat(myCar.color) + " " +myCar.year + " " + myCar.price);
        myCar.drive();
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        //
        System.out.println(myCar3.make2);
        System.out.println(myCar3.model2);
        System.out.println(myCar3.color2);
        System.out.println(myCar3.year2);

        Human human = new Human("Paul", 54, 79.89);
        Human human1 = new Human("Rick", 33, 96);
        System.out.println(human.name);
        System.out.println(human1.name);
        human1.eat();
        human.drink();
        System.out.println(myCar.toString());
        System.out.println(myCar2.toString2());
        System.out.println(myCar);
    }
}
