package es.diego.castano.klondike.views.actions;

import es.diego.castano.klondike.controllers.actions.FoundationToTableauController;
import es.diego.castano.klondike.views.IO;
import es.diego.castano.klondike.views.View;

public class FoundationToTableauView implements View {

	private FoundationToTableauController controller;
	
	public FoundationToTableauView(FoundationToTableauController foundationToTableauController) {
		this.controller = foundationToTableauController;
	}

	@Override
	public void render() {
		IO io = new IO();
		io.writeln("Foundation to tableau view");
	}

}
