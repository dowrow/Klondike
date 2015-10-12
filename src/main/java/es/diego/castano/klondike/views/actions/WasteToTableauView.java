package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.WasteToTableauController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class WasteToTableauView implements View {
	
	private WasteToTableauController controller;
	
	public WasteToTableauView(WasteToTableauController wasteToTableauController) {
		controller = wasteToTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Waste to tableau view");
	}

}
