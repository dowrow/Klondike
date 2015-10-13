package es.diego.castano.klondike.models.cardstacks;

import es.diego.castano.klondike.models.cards.Card;

public class Tableau extends CardStack {

	@Override
	public boolean isValidOnTop(Card card) {
		Card topCard = this.viewCardFromTop();
		if (topCard.getSuit() != card.getSuit()
				&& card.getNumber().getValue() == (topCard.getNumber().getValue() - 1)) {
			return true;
		}
		return false;
	}

	public void flipTopCard() {
		Card topCard = this.takeCardFromTop();
		topCard.flip();
		this.putCardOnTop(topCard);
	}
}
