package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.utils.RangeSelector;
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
		RangeSelector selector = new RangeSelector();
		if (controller.isWasteEmpty()) {
			io.writeln("ERROR!!! No hay cartas en el descarte.");
			return;
		}
		tableauNumber = selector.read(1, Klondike.NUM_TABLEAUS, "A qué escalera?", "ERROR!! Escalera no válida");
		controller.setTableauIndex(tableauNumber - 1);
		controller.move();
	}
}
