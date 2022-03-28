package com.bridgelabz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		DeckOfCards cards = new DeckOfCards();
		ArrayList<String> make = cards.deckOfCards();
		
		cards.deckOfCards();
		cards.noOfPlayers();
		cards.playsequence(2);
		cards.shuffle(make);

	}

}
