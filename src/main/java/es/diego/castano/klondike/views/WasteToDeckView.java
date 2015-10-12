package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.WasteToDeckController;

public class WasteToDeckView implements View {

	private WasteToDeckController controller;
	
	public WasteToDeckView(WasteToDeckController wasteToDeckController) {
		controller = wasteToDeckController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Waste to deck view");
	}

}
