package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.FlipOnTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.views.IO;
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
		boolean isValid;
		do {
			tableauNumber = io.readInt("En qué escalera? [1-" + Klondike.NUM_TABLEAUS + "]: ");	
			isValid = isValid(tableauNumber);
			if (!isValid) {
				io.writeln("ERROR!!! La escalera seleccionada no es válida.");
			}
		} while (!isValid);
		if (controller.isFaceUp(tableauNumber - 1)) {
			io.writeln("ERROR!!! No se puede voltear una carta descubierta.");
		} else {
			controller.flip(tableauNumber - 1);	
		}
		
	}
	
	private boolean isValid(int tableauNumber) {
		return tableauNumber > 0 && tableauNumber <= Klondike.NUM_TABLEAUS;
	}
}
