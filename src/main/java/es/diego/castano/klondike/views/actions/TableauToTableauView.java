package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.TableauToTableauController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.utils.RangeSelector;
import es.diego.castano.klondike.views.View;

public class TableauToTableauView implements View {
	
	private TableauToTableauController controller;
	
	public TableauToTableauView(TableauToTableauController tableauToTableauController) {
		controller = tableauToTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		RangeSelector selector = new RangeSelector();
		int sourceTableauIndex = selector.read(1, Klondike.NUM_TABLEAUS, "De qué escalera?", "ERROR!!! Escalera no válida");
		int destinationTableauIndex = selector.read(1, Klondike.NUM_TABLEAUS, "A qué escalera?", "ERROR!!! Escalera no válida");
		controller.setTableauIndex(sourceTableauIndex);
		controller.setDestinationTableauIndex(destinationTableauIndex);
		if (controller.isValid()) {
			controller.move();
		} else {
			io.writeln("ERROR!!! No se puede mover la carta a esa escalera");
		}
	}

}
