package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cards.Card;

public class CardView {
	
	private Card card;
	
	public CardView(Card card) {
		this.card = card;
	}
	
	public void render() {
		IO io = new IO();
		if (card.isFaceUp()) {
			io.write("[" + card.getNumber() + "," + card.getSuit() + "]");
		} else {
			io.write("[X,X]");
		}
	}
}
