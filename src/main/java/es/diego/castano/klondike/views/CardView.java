package es.diego.castano.klondike.views;

import es.diego.castano.klondike.cards.Card;

public class CardView {
	private Card card;
	
	public CardView(Card card) {
		this.card = card;
	}
	
	public void render() {
		System.out.print(card.toString());
	}
}
