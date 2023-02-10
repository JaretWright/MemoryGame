package com.example.memorygame;

public class Experiment {
    public static void main(String[] args) {
        Card aceOfSpades = new Card("Spades","ace");
        Card kingOfHearts = new Card("hearts","king");
        Card twoOfHearts = new Card("hearts","2");
        System.out.println(aceOfSpades);
        System.out.println(kingOfHearts);

        System.out.printf("%s value: %d %n",aceOfSpades, aceOfSpades.getValue());
        System.out.printf("%s value: %d %n",kingOfHearts, kingOfHearts.getValue());
        System.out.printf("%s value: %d %n",twoOfHearts, twoOfHearts.getValue());


    }
}
