package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.DeckToWasteController;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.views.View;

public class DeckToWasteView implements View {

	private DeckToWasteController controller;
	
	public DeckToWasteView(DeckToWasteController deckToWasteController) {
		this.controller = deckToWasteController;
	}
	
	@Override
	public void render() {
		IO io = new IO();
		if (controller.isDeckEmpty()) {
			io.writeln("ERROR!!! La baraja no tiene más cartas.");	
			return;
		}
		if (controller.isWasteEmpty()){
			controller.move();
		} else {
			io.writeln("ERROR!!! Ya hay cartas en el descarte.");
		}
	}
}
