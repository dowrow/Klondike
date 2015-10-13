package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToFoundationController;
import es.diego.castano.klondike.utils.IO;
import es.diego.castano.klondike.views.View;

public class WasteToFoundationView implements View {

	private WasteToFoundationController controller;
	
	public WasteToFoundationView(WasteToFoundationController wasteToFoundationController) {
		controller = wasteToFoundationController;
	}

	@Override
	public void render() {
		IO io = new IO();
		if (controller.isPossible()) {
			controller.move();
		} else {
			io.writeln("ERROR!!! No se puede mover del descarte a ningún palo.");
		}
	}

}
