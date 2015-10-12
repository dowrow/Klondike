package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.DeckToWasteController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

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
