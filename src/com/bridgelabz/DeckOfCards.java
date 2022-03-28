package com.bridgelabz;

public class DeckOfCards {
	private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int cards= suits.length * ranks.length;
	
	String[] deckInitialize() {
		String[] deck = new String[this.cards];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
				System.out.println(deck[suits.length * i + j]);
			}
		}
		
		for (int i = 0; i < cards; i++) {
			int r = i + (int) (Math.random() * (cards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;

	}
	
	public static void main(String[] args) {
	    System.out.println("welcome to deck of cards program");
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.deckInitialize();

	}

}

