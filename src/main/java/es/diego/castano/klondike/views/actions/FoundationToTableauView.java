package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.FoundationToTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.models.cards.Suit;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.utils.RangeSelector;
import es.diego.castano.klondike.views.View;

public class FoundationToTableauView implements View {

	private FoundationToTableauController controller;
	
	public FoundationToTableauView(FoundationToTableauController foundationToTableauController) {
		this.controller = foundationToTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		RangeSelector selector = new RangeSelector();
		int foundationNumber = selector.read(1, Suit.values().length, "De qué palo?", "ERROR!!! Palo no válido");
		int tableauNumber = selector.read(1, Klondike.NUM_TABLEAUS, "A qué escalera?", "ERROR!!! Escalera no válida");
		controller.setFoundationIndex(foundationNumber - 1);
		controller.setTableauIndex(tableauNumber - 1);
		if (controller.isValid()) {
			controller.move();
		} else {
			io.writeln("ERROR!!! No se puede mover la carta a esa escalera");
		}
	}

}
