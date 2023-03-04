package org.example.Pizza_Hello_Bro;

import java.util.stream.Stream;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza( String bread,    String sauce, String cheese,  String topping ){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
    Pizza(String sauce, String cheese,  String topping ){
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String cheese,  String topping ){
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String cheese){
        this.cheese = cheese;
    }
}
