package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToDeckController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class WasteToDeckView implements View {

	private WasteToDeckController controller;
	
	public WasteToDeckView(WasteToDeckController wasteToDeckController) {
		controller = wasteToDeckController;
	}

	@Override
	public void render() {
		IO io = new IO();
		if (controller.isWasteEmpty()) {
			io.writeln("ERROR!!! No hay cartas en el descarte.");
		} else {
			controller.move();
		}
	}

}
