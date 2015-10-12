package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cards.Number;
import es.diego.castano.klondike.models.cards.Suit;

public class Deck extends CardStack {
	
	public static final int MAX_SIZE = 52;
	
	public Deck(){
		for (Suit suit : Suit.values()){
			for (Number number : Number.values()) {
				this.putCardOnTop(new Card(number, suit));
			}	
		}
	}

	@Override
	public boolean isValidOnTop(Card card) {
		if (this.getSize() < MAX_SIZE) {
			return true;
		}
		return false;
	}

	public void putCardOnBottom(Card card) {
		this.getCards().insertElementAt(card, this.getSize());
	}
}
