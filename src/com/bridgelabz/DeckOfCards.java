package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards extends Player {

public ArrayList<String> cardsDeck = new ArrayList<>();

	
	public void deckOfCards() {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
    
    int numOfCards = suits.length * ranks.length;
   
    
    System.out.println("\nNumber of cards in the deck is : " +numOfCards);
    
    
    for (int i = 0; i < ranks.length; i++) {

        for (int j = 0; j < suits.length; j++) {
            cardsDeck.add(ranks[i] + " " + suits[j]);

        }
    }
  }
}

