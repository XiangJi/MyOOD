package cards;

import java.util.ArrayList;

// T can be replace by the real type
public class Hand <T extends Card>{
	protected ArrayList<T> cards = new ArrayList<T>();
	
	public int score() {
		int score = 0;
		for (T card : cards) {
			score += card.value();
		}
		return score;
	}
	
	public void addCard(T card) {
		cards.add(card);
	}
	
}
