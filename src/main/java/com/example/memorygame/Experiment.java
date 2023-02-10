package com.example.memorygame;

import java.util.Collections;

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

        System.out.println("\n  ~~~~ Building a DeckOfCards  ~~~~~");
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (int i=1; i<=5; i++)
            System.out.println(deck.dealTopCard());
    }


}
