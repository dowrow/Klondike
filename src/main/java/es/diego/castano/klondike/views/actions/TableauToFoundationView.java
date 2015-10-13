package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.TableauToFoundationController;
import es.diego.castano.klondike.models.Klondike;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.utils.RangeSelector;
import es.diego.castano.klondike.views.View;

public class TableauToFoundationView implements View {
	
	private TableauToFoundationController controller;
	
	public TableauToFoundationView(TableauToFoundationController tableauToFoundationController) {
		controller = tableauToFoundationController;
	}

	@Override
	public void render() {
		IO io = new IO();
		RangeSelector selector = new RangeSelector();
		int tableauNumber = selector.read(1, Klondike.NUM_TABLEAUS, "De qué escalera?", "ERROR!!! Escalera no válida");
		controller.setTableauIndex(tableauNumber-1);
		if (controller.isValid()) {
			controller.move();
		} else {
			io.writeln("ERROR!!! No se puede mover a ningún palo");
		}
	}

}
