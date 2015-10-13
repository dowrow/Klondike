package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cards.Card;
import es.diego.castano.klondike.utils.IO;

public class CardView implements View {
	
	private Card card;
	
	public CardView(Card card) {
		this.card = card;
	}
	
	@Override
	public void render() {
		IO io = new IO();
		if (card.isFaceUp()) {
			io.write("[" + card.getNumber() + "," + card.getSuit() + "]");
		} else {
			io.write("[X,X]");
		}
	}
}
