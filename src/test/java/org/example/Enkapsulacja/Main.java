package org.example.Enkapsulacja;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford","Mustang",2023);
        Car car1 = new Car("Citroen", "Picasso", 2018);
//        System.out.println(car.make);
        System.out.println(car);
        System.out.println(car1);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.setMake("Audi");
        car.setModel("A8");
        car.setYear(2022);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        car1.copy(car); // można skopiować atrybuty car do car2 i zachować 2 adresy w pamięci
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        Car car2 = new Car(car1); // podobna metoda do zapisu powyżej
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
