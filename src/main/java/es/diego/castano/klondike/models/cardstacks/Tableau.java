package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;

public class Tableau extends CardStack{

	@Override
	public boolean isValidOnTop(Card card) {
		return true;
	}
	
	public void flipTopCard() {
		Card topCard = this.takeCardFromTop();
		topCard.flip();
		this.putCardOnTop(topCard);
	}
}
