package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.models.cards.Suit;
import es.diego.castano.klondike.models.cards.Number;

public class Foundation extends CardStack {
	
	private Suit suit;
	
	public Foundation (Suit suit) {
		this.suit = suit;
	}

	@Override
	public boolean isValidOnTop(Card card) {
		
		if (!card.isFaceUp() || card.getSuit() != this.suit) {
			return false;
		}
	
		if (this.isEmpty() && card.getNumber() == Number.AS) {
			return true;
		}
		
		if (!this.isEmpty() && 
				this.viewCardFromTop().getNumber().getValue() < 
					card.getNumber().getValue()) {
			return true;
		}
		
		return false;
	}
}
