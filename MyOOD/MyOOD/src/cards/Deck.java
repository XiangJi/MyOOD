package cards;

import java.util.ArrayList;

public class Deck <T extends Card> {
	private ArrayList<T> cards; // all cards
	private int dealtIndex = 0; // marks first undealt card
	
	public void setDeckOfCards (ArrayList<T> deckOfCards) {
		
	}
	
	public void shuffle() {
		
	}
	
	public int remainingCards() {
		return cards.size() - dealtIndex;
	}
}
