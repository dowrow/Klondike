package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.FlipOnTableauController;

public class FlipOnTableauView implements View {
	
	private FlipOnTableauController controller;
	
	public FlipOnTableauView(FlipOnTableauController flipOnTableauController) {
		this.controller = flipOnTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Flip on tableau view");
	}

}
