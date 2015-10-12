package es.diego.castano.klondike.views;

import es.diego.castano.klondike.controllers.FoundationToTableauController;

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
