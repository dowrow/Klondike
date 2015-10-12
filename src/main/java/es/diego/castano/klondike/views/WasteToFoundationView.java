package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.WasteToFoundationController;

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
