package org.example.oop_hello_bro;

public class Friend {
    String name;
    static int numberOfFriends;
    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
