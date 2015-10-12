package es.diego.castano.klondike.views;

import es.diego.castano.klondike.models.cardstacks.Deck;

public class DeckView implements View {
	
	private Deck deck;
	
	public DeckView(Deck deck) {
		this.deck = deck;
	}
	
	@Override
	public void render() {
		IO io = new IO();
		if (deck.isEmpty()) {
			io.write("<vacio>");
		} else{
			CardView cardView = new CardView(deck.viewCardFromTop());
			cardView.render();
		}
	}
}
