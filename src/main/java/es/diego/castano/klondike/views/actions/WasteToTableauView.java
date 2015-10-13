package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class WasteToTableauView implements View {
	
	private WasteToTableauController controller;
	
	public WasteToTableauView(WasteToTableauController wasteToTableauController) {
		controller = wasteToTableauController;
	}

	@Override
	public void render() {
		int tableauNumber;
		IO io = new IO();
		boolean isValid;
		
		if (controller.isWasteEmpty()) {
			io.writeln("ERROR!!! No hay cartas en el descarte.");
			return;
		}
		
		do {
			tableauNumber = io.readInt("A qué escalera? [1-" + Klondike.NUM_TABLEAUS + "]: ");	
			isValid = isValid(tableauNumber);
			if (!isValid) {
				io.writeln("ERROR!!! La escalera seleccionada no es válida.");
			}
		} while (!isValid);
		
		controller.move(tableauNumber - 1);
	}

	private boolean isValid(int tableauNumber) {
		return tableauNumber > 0 && tableauNumber <= Klondike.NUM_TABLEAUS;
	}

}
