package es.diego.castano.klondike.views;

import es.diego.castano.klondike.cardStacks.Deck;

public class DeckView {
	private Deck deck;
	
	public DeckView(Deck deck) {
		this.deck = deck;
	}
	
	public void render() {
		System.out.print(deck.toString());
	}
}
