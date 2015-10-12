package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToFoundationController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class WasteToFoundationView implements View {

	private WasteToFoundationController controller;
	
	public WasteToFoundationView(WasteToFoundationController wasteToFoundationController) {
		controller = wasteToFoundationController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Waste to foundation view");
	}

}
