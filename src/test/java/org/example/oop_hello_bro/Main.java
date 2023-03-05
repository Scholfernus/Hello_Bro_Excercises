package org.example.oop_hello_bro;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        CarMainProject car1 = new CarMainProject("BMW");
        CarMainProject car2 = new CarMainProject("Tesla");
        garage.park(car1);
        garage.park(car2);
    }

}
