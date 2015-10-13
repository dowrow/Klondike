package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.FlipOnTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.utils.RangeSelector;
import es.diego.castano.klondike.views.View;

public class FlipOnTableauView implements View {
	
	private FlipOnTableauController controller;
	
	public FlipOnTableauView(FlipOnTableauController flipOnTableauController) {
		this.controller = flipOnTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		int tableauNumber;
		RangeSelector selector = new RangeSelector();
		tableauNumber = selector.read(1, Klondike.NUM_TABLEAUS, "En qué escalera?", "ERROR!! Escalera no válida");
		if (controller.isFaceUp(tableauNumber - 1)) {
			io.writeln("ERROR!!! No se puede voltear una carta descubierta.");
		} else {
			controller.flip(tableauNumber - 1);	
		}	
	}
}
