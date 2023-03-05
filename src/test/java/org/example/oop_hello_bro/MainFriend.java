package org.example.oop_hello_bro;

public class MainFriend {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Andrew");
        Friend friend3 = new Friend("Paul");
        Friend friend4 = new Friend("Simon");
        Friend friend5 = new Friend("Grece");
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
