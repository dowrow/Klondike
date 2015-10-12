package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.FlipOnTableauController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

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
