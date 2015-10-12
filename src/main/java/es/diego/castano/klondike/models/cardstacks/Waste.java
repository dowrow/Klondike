package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;

public class Waste extends CardStack {
	
	public static final int MAX_SIZE = 3;
	
	@Override
	public void putCardOnTop(Card card) {
		if (this.getSize() < MAX_SIZE) {
			super.putCardOnTop(card);
		}
	}

	@Override
	public boolean isValidOnTop(Card card) {
		return true;
	}
}
