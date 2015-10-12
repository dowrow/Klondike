package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.WasteToTableauController;

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
