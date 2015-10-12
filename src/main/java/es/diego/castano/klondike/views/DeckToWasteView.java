package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.DeckToWasteController;

public class DeckToWasteView implements View {

	private DeckToWasteController controller;
	
	public DeckToWasteView(DeckToWasteController deckToWasteController) {
		this.controller = deckToWasteController;
	}
	
	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Deck to waste view");
	}

}
