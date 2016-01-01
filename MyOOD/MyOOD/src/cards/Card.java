package cards;

public abstract class Card {
	private boolean available = true;
	
	/*
	 * number and face that's on card - a numbe 2 through 10, 
	 * or 11 for Jack, 12 for Queen, 13 for King, or 1 for Ace
	 */
	protected int faceValue;
	protected Suit suit;
	
	public Card(int c, Suit s) {
		faceValue = c;
		suit = s;
	}
	
	public abstract int value();
	
	public Suit suit() {
		return suit;
	}
	
	// check if the card is available to be given to someone
	public boolean isAvailable() {
		return available;
	}
	
	public void markUnavailable() {
		available = false;
	}
	
	public void markAvailable() {
		available = true;
	}
}
