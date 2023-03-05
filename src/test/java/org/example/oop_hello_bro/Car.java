package org.example.oop_hello_bro;

public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;
    String make2 = "Ford";
    String model2 = "Mustang";
    String color2 = "red";
    int year2 = 2021;

    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You step on the brakes");
    }

    @Override
    public String toString() {
        return make + "\n" + model +"\n" + color + "\n" + year;
    }
    public String toString2(){
        return make2 + "\n" + model2 +"\n" + color2 + "\n" + year2;

    }
}
