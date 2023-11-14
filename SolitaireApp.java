package com.telran.org.homeworkeleven;

import java.util.*;

public class SolitaireApp {

    public static void main(String[] args) {

        List<Card> cardDeck = new ArrayList<>();

        for (Suit suits : Suit.values()) {
            for (Rank ranks : Rank.values()) {
                Card card = new Card(suits, ranks);
                cardDeck.add(card);
            }
        }

        Collections.shuffle(cardDeck, new Random());

        Stack<Card> solitarie = new Stack<>();
        for (Card cards : cardDeck) {
            if (!solitarie.isEmpty() && solitarie.peek().suit == cards.suit) {
                solitarie.pop();
            } else {
                solitarie.push(cards);
            }
        }

        for (Card card : solitarie){
            System.out.println(card);
        }
        System.out.println(solitarie.size());

        if (solitarie.size() == 4) {
            System.out.println("Пасьянс сошелся!");
        } else {
            System.out.println("Пасьянс не сошелся.");
        }
    }
}
